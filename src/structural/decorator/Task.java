package structural.decorator;


public class Task {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaTeamlead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(javaDeveloper.doJob());
    }
}
