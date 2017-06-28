package behavioral.interperter;


public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does developer knows Java Core : " + isJava.interpret("Java Core"));
        System.out.println("Does developer knows Java EE : " + isJavaEE.interpret("Spring Java Core"));
    }

    public static Expression getJavaExpression(){
        Expression javaCore = new TerminalExpression("Java Core");
        Expression java = new TerminalExpression("Java");
        return new OrExpression(java, javaCore);
    }
    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java Core");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java, spring);
    }
}
