package Week12;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Hien.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = "white";
    }

    /**
     * Hien.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        this.coordinatesX = coordinatesX;
        this.coordinatesY = coordinatesY;
        this.color = color;
    }

    /**
     * Hien.
     */
    public abstract String getSymbol();

    /**
     * Hien.
     */
    public abstract boolean canMove(Board board, int x, int y);

    /**
     * Hien.
     */
    public int getCoordinatesX() {
        return coordinatesX;
    }

    /**
     * Hien.
     */
    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    /**
     * Hien.
     */
    public int getCoordinatesY() {
        return coordinatesY;
    }

    /**
     * Hien.
     */
    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    /**
     * Hien.
     */
    public String getColor() {
        return color;
    }

    /**
     * Hien.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Hien.
     */
    public boolean checkPosition(Piece piece) {
        return this.coordinatesX == piece.coordinatesX
                && this.coordinatesY == piece.coordinatesY;
    }
}
