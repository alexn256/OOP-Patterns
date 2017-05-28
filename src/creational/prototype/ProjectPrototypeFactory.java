package creational.prototype;


public class ProjectPrototypeFactory {

    Project project;

    public ProjectPrototypeFactory(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    Object cloneProject(){
        return project.copy();
    }
}
