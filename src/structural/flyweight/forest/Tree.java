package structural.flyweight.forest;

import java.awt.*;

/**
 * Object that contains unique state of tree.
 *
 * @author Alexander Naumov
 */


public class Tree {

    private int x;
    private int y;
    private TypeTree type;

    public Tree(int x, int y, TypeTree type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
