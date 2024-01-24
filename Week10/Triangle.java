

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /** Hien. */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        if (p1 == p2 || p2 == p3 || p3 == p1 || this.getArea() == 0) {
            throw new RuntimeException("Illegal triangle");
        }
    }

    /** Hien. */
    public Point getP1() {
        return p1;
    }

    /** Hien. */
    public Point getP2() {
        return p2;
    }

    /** Hien. */
    public Point getP3() {
        return p3;
    }

    /** Hien. */
    @Override
    public double getArea() {
        return (p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
    }

    /** Hien. */
    @Override
    public double getPerimeter() {
        return p1.getDistance(p2) + p2.getDistance(p3) + p3.getDistance(p1);
    }

    /** Hien. */
    @Override
    public String getInfo() {
        return "Triangle[" + p1 + "," + p2 + "," + p3 + "]";
    }
}
