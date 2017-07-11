package behavioral.visitor;


public class JuniorDeveloper implements Developer {

    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Junior Developer crate bad Java class.");
    }

    @Override
    public void create(ProjectDatabase database) {
        System.out.println("Junior Developer drop database.");
    }

    @Override
    public void create(ProjectTest test) {
        System.out.println("Junior Developer write failing Java test.");
    }
}
