package creational.builder.product;

public class Door {

    private String material;
    private int price;

    public Door(String material, int price) {
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Door:" + "[material='" + material + '\'' + ", price=" + price + ']';
    }
}
