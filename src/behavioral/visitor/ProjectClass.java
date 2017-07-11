package behavioral.visitor;


public class ProjectClass implements ProjectElement{

    @Override
    public void beWriten(Developer developer) {
        developer.create(this);
    }
}
