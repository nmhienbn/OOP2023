

import java.util.Objects;

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
    public double distance(Point newPoint) {
        return Math.sqrt((pointX - newPoint.pointX) * (pointX - newPoint.pointX)
                + (pointY - newPoint.pointY) * (pointY - newPoint.pointY));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return pointX == other.pointX && pointY == other.pointY;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPointX(), getPointY());
    }

    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ')';
    }
}
