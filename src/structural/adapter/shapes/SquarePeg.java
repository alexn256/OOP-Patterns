package structural.adapter.shapes;

/**
 * Square pegs is incompatible with round holes.
 * But we must integrate them in our system.
 *
 * @author Alexander Naumov
 */


public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        return Math.pow(this.width, 2);
    }
}
