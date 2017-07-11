package examinator;


public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator();

        System.out.println("Your creational pattern is:" + examinator.getCreational());
        System.out.println("Your structural pattern is:" + examinator.getStructural());
        System.out.println("Your behavioral pattern is:" + examinator.getBehavioral());

        System.out.println("\n Good luck!!!");
    }
}
