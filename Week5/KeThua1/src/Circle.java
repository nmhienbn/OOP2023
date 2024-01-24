package Week5.KeThua1.src;

public class Circle {
    private double radius;
    private String color;
    protected final double pi = 3.14;

    /**
     * Constructor.
     */
    public Circle() {
    }

    /**
     * Constructor radius.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor radius, color.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Get radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set radius.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get area.
     */
    public double getArea() {
        return pi * radius * radius;
    }

    /**
     * To string.
     */
    @Override
    public String toString() {
        return String.format("Circle[radius=%lf,color=%lf]", radius, color);
    }
}
