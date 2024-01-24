

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /** Hien. */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /** Hien. */
    public Point getCenter() {
        return center;
    }

    /** Hien. */
    public void setCenter(Point center) {
        this.center = center;
    }

    /** Hien. */
    public double getRadius() {
        return radius;
    }

    /** Hien. */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Hien. */
    public double getArea() {
        return PI * Math.pow(this.radius, 2);
    }

    /** Hien. */
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    /** Hien. */
    public String getInfo() {
        return "Circle[" + center + ",r=" + String.format("%.2f", radius) + "]";
    }
}
