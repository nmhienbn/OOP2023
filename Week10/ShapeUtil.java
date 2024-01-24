

import java.util.List;

public class ShapeUtil {
    /** Hien. */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder res = new StringBuilder();
        res.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                res.append(shape.getInfo());
                res.append('\n');
            }
        }
        res.append("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                res.append(shape.getInfo());
                res.append('\n');
            }
        }
        return res.toString();
    }
}
