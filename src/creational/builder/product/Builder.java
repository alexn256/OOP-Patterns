package creational.builder.product;

public interface Builder {
    void buildRoof();
    void buildWall();
    void buildWindow();
    void buildDoor();
    House getHouse();
}
