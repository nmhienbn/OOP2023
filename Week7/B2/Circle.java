

import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /** Hien. */
    public Circle() {
    }

    /** Hien. */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Hien. */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Hien.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
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

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ",radius="
                + radius + ",color=" + color
                + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle other = (Circle) o;
            return center.equals(other.center) && radius == other.radius;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}
