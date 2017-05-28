package creational.prototype;


public class Project implements Copyable{

    private int id;
    private String name;
    private String source;

    public Project(int id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, name, source);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
