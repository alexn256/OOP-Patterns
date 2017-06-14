package structural.proxy;


public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("www.github.com/oby1kenoby/OOP_Paterns");
        project.run();
    }
}
