package behavioral.visitor;


public class Project implements ProjectElement{
    private ProjectElement[] elements;

    public Project() {
        this.elements = new ProjectElement[]{
                new ProjectClass(),
                new ProjectDatabase(),
                new ProjectTest()
        };
    }

    @Override
    public void beWriten(Developer developer) {
        for(ProjectElement element: elements){
            element.beWriten(developer);
        }
    }
}
