package behavioral.visitor.xmlserialization.shapes;

import behavioral.visitor.xmlserialization.visitor.Visitor;

/**
 * @author Alexander Naumov
 */


public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
