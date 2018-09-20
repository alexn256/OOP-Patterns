package structural.adapter.shapes;

/**
 * Round peg is compatible with round holes.
 *
 * @author Alexander Naumov
 */


public class RoundPeg {

    private double radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public RoundPeg() {
    }

    public double getRadius() {
        return radius;
    }
}
