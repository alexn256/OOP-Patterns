package behavioral.visitor;


public class ProjectDatabase implements ProjectElement{

    @Override
    public void beWriten(Developer developer) {
        developer.create(this);
    }
}
