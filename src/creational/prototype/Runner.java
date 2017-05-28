package creational.prototype;


public class Runner {
    public static void main(String[] args) {
        Project project = new Project(1, "Prototype", "JavaProject");
        ProjectPrototypeFactory projectPrototypeFactory = new ProjectPrototypeFactory(project);
        Project copy = (Project) projectPrototypeFactory.cloneProject();
        System.out.println(project);
        System.out.println("===============================");
        System.out.println(copy);
    }
}
