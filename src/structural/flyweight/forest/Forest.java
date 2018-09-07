package structural.flyweight.forest;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * GUI-Forest, that draws tree.
 *
 * @author Alexander Naumov
 */


public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
       TypeTree type = TreeFactory.getTypeTree(name, color, otherTreeData);
       Tree tree = new Tree(x, y, type);
       trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        trees.forEach(tree -> tree.draw(graphics));
    }
}
