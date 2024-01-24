package Week5.KeThua1.src;

public class Cylinder extends Circle {
    private double height;

    /**
     * Constructor.
     */
    public Cylinder() {
    }

    /**
     * Constructor radius, height.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor height.
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Constructor radius, height, color.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Get height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get volume.
     */
    public double getVolume() {
        return this.getArea() * height;
    }

    /**
     * To String.
     */
    @Override
    public String toString() {
        return String.format("Cylinder[%s,height=%lf]", super.toString(), height);
    }

    @Override
    public double getArea() {
        return super.getArea() + 2 * pi * height;
    }
}
