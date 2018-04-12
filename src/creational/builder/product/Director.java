package creational.builder.product;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public House construct(){
        builder.buildRoof();
        builder.buildDoor();
        builder.buildWall();
        builder.buildWindow();
        return builder.getHouse();
    }
}
