package Week7.B1;

public class Rectangle extends Shape {
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
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }
}
