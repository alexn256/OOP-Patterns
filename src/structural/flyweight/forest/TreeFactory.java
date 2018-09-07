package structural.flyweight.forest;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Factory of  trees.
 *
 * @author Alexander Naumov
 */
public class TreeFactory {

    static Map<String, TypeTree> treeTypes = new HashMap<>();

    public static  TypeTree getTypeTree(String name, Color color, String otherTreeData) {
        TypeTree result = treeTypes.get(name);
        if (result == null) {
            result = new TypeTree(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}
