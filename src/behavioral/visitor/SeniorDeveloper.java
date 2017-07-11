package behavioral.visitor;


public class SeniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Senior Developer create good Java class.");
    }

    @Override
    public void create(ProjectDatabase database) {
        System.out.println("Senior Developer fixing database.");
    }

    @Override
    public void create(ProjectTest test) {
        System.out.println("Senior Developer create right Java test.");
    }
}
