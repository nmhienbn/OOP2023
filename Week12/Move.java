package Week12;

public class Move {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Piece movedPiece;
    private Piece killedPiece;

    /**
     * Hien.
     */
    public Move(int startX, int endX, int startY, int endY,
                Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Hien.
     */
    public Move(int startX, int endX, int startY, int endY,
                Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    }

    /**
     * Hien.
     */
    @Override
    public String toString() {
        return movedPiece.getColor() + "-" + movedPiece.getSymbol()
                + (char) (endX + 'a' - 1) + endY;
    }

    /**
     * Hien.
     */
    public int getStartX() {
        return startX;
    }

    /**
     * Hien.
     */
    public void setStartX(int startX) {
        this.startX = startX;
    }

    /**
     * Hien.
     */
    public int getStartY() {
        return startY;
    }

    /**
     * Hien.
     */
    public void setStartY(int startY) {
        this.startY = startY;
    }

    /**
     * Hien.
     */
    public int getEndX() {
        return endX;
    }

    /**
     * Hien.
     */
    public void setEndX(int endX) {
        this.endX = endX;
    }

    /**
     * Hien.
     */
    public int getEndY() {
        return endY;
    }

    /**
     * Hien.
     */
    public void setEndY(int endY) {
        this.endY = endY;
    }

    /**
     * Hien.
     */
    public Piece getMovedPiece() {
        return movedPiece;
    }

    /**
     * Hien.
     */
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }

    /**
     * Hien.
     */
    public Piece getKilledPiece() {
        return killedPiece;
    }

    /**
     * Hien.
     */
    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}
