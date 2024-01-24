package Week7.B2;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /** Hien. */
    public Shape() {
    }

    /** Hien. */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /** Hien. */
    public String getColor() {
        return color;
    }

    /** Hien. */
    public void setColor(String color) {
        this.color = color;
    }

    /** Hien. */
    public boolean isFilled() {
        return filled;
    }

    /** Hien. */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Hien. */
    public abstract double getArea();

    /** Hien. */
    public abstract double getPerimeter();

    /** Hien. */
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
