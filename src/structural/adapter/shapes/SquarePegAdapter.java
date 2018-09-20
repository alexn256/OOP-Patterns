package structural.adapter.shapes;

/**
 * Adapter is letting to use square pegs and round holes together.
 *
 * @author Alexander Naumov
 */


public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return  (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}
