package behavioral.visitor.xmlserialization.visitor;

import behavioral.visitor.xmlserialization.shapes.Circle;
import behavioral.visitor.xmlserialization.shapes.CompoundShape;
import behavioral.visitor.xmlserialization.shapes.Dot;
import behavioral.visitor.xmlserialization.shapes.Rectangle;

/**
 * @author Alexander Naumov
 */


public interface Visitor {
    String visitRectangle(Rectangle rectangle);
    String visitCircle(Circle circle);
    String visitDot(Dot dot);
    String visitCompoundGraphic(CompoundShape compoundShape);
}
