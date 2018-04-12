package creational.builder.product;

public class Roof {

    private String material;
    private String type;

    public Roof(String material, String type) {
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Roof:" + "[material='" + material + '\'' + ", type='" + type + '\'' + ']';
    }
}
