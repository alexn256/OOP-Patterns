package creational.builder.product;

public class HouseBuilder implements Builder{

    private House house;
    private int w;
    private int d;
    private int win;

    public HouseBuilder(int d, int w, int win) {
        this.house = new House();
        this.w = w;
        this.d = d;
        this.win = win;
    }

    @Override
    public void buildRoof() {
        house.setRoof(new Roof("Steel", "slate"));
    }

    @Override
    public void buildWall() {
        Wall[] walls = new Wall[w];
        for (int i = 0; i < walls.length; i++){
            walls[i] = new Wall("Stone", "green");
        }
        house.setWalls(walls);
    }

    @Override
    public void buildWindow() {
        Window[] windows = new Window[win];
        for(int i = 0; i < windows.length; i++){
            windows[i] = new Window("Plastic", "big");
        }
        house.setWindows(windows);
    }

    @Override
    public void buildDoor() {
        Door[] doors = new Door[d];
        for(int i = 0; i < doors.length; i++){
            doors[i] = new Door("Wood", 200);
        }
        house.setDoors(doors);
    }

    @Override
    public House getHouse() {
        return house;
    }
}