package creational.builder.product;

public class Window {

    private String material;
    private String size;

    public Window(String material, String size) {
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Window:" + "[material='" + material + '\'' + ", size='" + size + '\'' + ']';
    }
}
