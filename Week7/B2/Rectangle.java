package Week7.B2;

import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /** Hien. */
    public Rectangle() {
    }

    /** Hien. */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /** Hien. */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Hien.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /** Hien. */
    public Point getTopLeft() {
        return topLeft;
    }

    /** Hien. */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /** Hien. */
    public double getWidth() {
        return width;
    }

    /** Hien. */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Hien. */
    public double getLength() {
        return length;
    }

    /** Hien. */
    public void setLength(double length) {
        this.length = length;
    }

    /** Hien. */
    @Override
    public double getArea() {
        return width * length;
    }

    /** Hien. */
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /** Hien. */
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft
                + ",width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle other = (Rectangle) o;
            return topLeft.equals(other.topLeft) && width == other.width && length == other.length;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getLength());
    }
}
