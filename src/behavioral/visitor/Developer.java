package behavioral.visitor;


public interface Developer {
    void create(ProjectClass projectClass);
    void create(ProjectDatabase database);
    void create(ProjectTest test);
}
