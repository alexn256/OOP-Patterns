package behavioral.visitor.xmlserialization.shapes;

import behavioral.visitor.xmlserialization.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Naumov
 */


public class CompoundShape implements Shape {

    private int id;
    private List<Shape> shapes = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    @Override
    public void move(int x, int y) {
        System.out.println("moving this shape...");
    }

    @Override
    public void draw() {
        System.out.println("drawing this shape...");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public int getId() {
        return id;
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}
