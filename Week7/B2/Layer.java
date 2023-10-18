

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * Hien.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Hien.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); ++i) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * Hien.
     */
    public String getInfo() {
        StringBuilder res = new StringBuilder();
        res.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            res.append(shape);
            res.append('\n');
        }
        return res.toString();
    }

    /**
     * Hien.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); ++i) {
            for (int j = i + 1; j < shapes.size(); ++j) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    --j;
                }
            }
        }
    }
}
