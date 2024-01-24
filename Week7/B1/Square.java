package Week7.B1;

public class Square extends Rectangle {
    /** Hien. */
    public Square() {
    }

    /** Hien. */
    public Square(double side) {
        super(side, side);
    }

    /** Hien. */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /** Hien. */
    public double getSide() {
        return width;
    }

    /** Hien. */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square[side=" + width + ",color=" + color + ",filled=" + filled + "]";
    }
}
