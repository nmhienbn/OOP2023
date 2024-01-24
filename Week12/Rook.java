package Week12;

public class Rook extends Piece {
    /**
     * Hien.
     */
    public Rook(int coordinateX, int coordinateY) {
        super(coordinateX, coordinateY);
    }

    /**
     * Hien.
     */
    public Rook(int coordinateX, int coordinateY, String color) {
        super(coordinateX, coordinateY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    private boolean check(int l, int x, int r) {
        return l <= x && x <= r;
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y)) {
            return false;
        }
        if (x != this.getCoordinatesX() && y != this.getCoordinatesY()) {
            return false;
        }
        for (Piece piece : board.getPieces()) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                if (piece.getColor().equals(this.getColor())) {
                    return false;
                }
            } else if (!piece.checkPosition(this)) {
                int x1 = this.getCoordinatesX();
                int y1 = this.getCoordinatesY();
                if (check(Math.min(x, x1), piece.getCoordinatesX(), Math.max(x, x1))
                        && check(Math.min(y, y1), piece.getCoordinatesY(), Math.max(y, y1))) {
                    return false;
                }
            }
        }
        return true;
    }
}
