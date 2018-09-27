package behavioral.visitor.xmlserialization.shapes;

import behavioral.visitor.xmlserialization.visitor.Visitor;

/**
 * @author Alexander Naumov
 */


public class Circle extends Dot {

    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
