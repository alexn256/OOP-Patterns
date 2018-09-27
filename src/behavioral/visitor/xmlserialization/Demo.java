package behavioral.visitor.xmlserialization;

import behavioral.visitor.xmlserialization.shapes.*;
import behavioral.visitor.xmlserialization.visitor.XMLExportVisitor;

/**
 * @author Alexander Naumov
 */


public class Demo {
    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.addShape(dot);
        compoundShape.addShape(circle);
        compoundShape.addShape(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.addShape(dot);
        compoundShape.addShape(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
