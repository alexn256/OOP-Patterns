package structural.adapter.shapes;

/**
 * Round hole is compatible with round pegs.
 *
 * @author Alexander Naumov
 */


public class RoundHole {

    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}
