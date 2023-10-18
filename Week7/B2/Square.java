

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

    /**
     * Hien.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
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
        return "Square[topLeft=" + topLeft + ",side=" + width
                + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square other = (Square) o;
            return topLeft.equals(other.topLeft) && width == other.width;
        }
        return false;
    }
}
