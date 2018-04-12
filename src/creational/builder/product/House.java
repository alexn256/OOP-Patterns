package creational.builder.product;


public class House {

    private Roof roof;
    private Door[] doors;
    private Wall[] walls;
    private Window[]windows;

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    public int getPrice() {
        return 50 + walls.length * 40 + doors.length * 10 + windows.length * 8;
    }

    @Override
    public String toString() {
        return "House:" + "[roof=" + roof + ", num doors=" + doors.length + ", num walls=" + walls.length + ']';
    }
}