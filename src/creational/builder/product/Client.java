package creational.builder.product;


public class Client {
    public static void main(String[] args) {
        Director director = new Director(new HouseBuilder(2, 8, 3));
        System.out.println(director.construct());
    }
}
