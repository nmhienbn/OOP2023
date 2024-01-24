

public class Point {
    private double pointX;
    private double pointY;

    /** Hien. */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /** Hien. */
    public double getPointX() {
        return pointX;
    }

    /** Hien. */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /** Hien. */
    public double getPointY() {
        return pointY;
    }

    /** Hien. */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /** Hien. */
    public double getDistance(Point other) {
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2)
                + Math.pow(this.pointY - other.pointY, 2));
    }

    /** Hien. */
    @Override
    public String toString() {
        return "(" + String.format("%.2f", pointX)
                + "," + String.format("%.2f", pointY)
                + ')';
    }
}
