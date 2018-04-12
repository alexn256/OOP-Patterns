package creational.builder.product;

public class Wall {

    private String material;
    private String color;

    public Wall(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wall:" + "[material='" + material + '\'' + ", color='" + color + '\'' + ']';
    }
}
