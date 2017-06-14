package structural.proxy;


public class RealProject implements Project{

    private String url;

    public RealProject(String url) {
        this.url = url;
        loadProject();
    }

    public void loadProject(){
        System.out.println("Loading project :" + url + " ...");
    }

    @Override
    public void run() {
        System.out.println("Running project: " + url + " ...");
    }
}
