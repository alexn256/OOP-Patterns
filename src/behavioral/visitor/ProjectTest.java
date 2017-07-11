package behavioral.visitor;


public class ProjectTest implements ProjectElement{

    @Override
    public void beWriten(Developer developer) {
        developer.create(this);
    }
}
