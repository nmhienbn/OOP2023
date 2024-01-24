package Week12;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * Hien.
     */
    public Board() {
    }

    /**
     * Hien.
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
            && getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }

    /**
     * Hien.
     */
    public boolean validate(int x, int y) {
        return 1 <= x && x <= WIDTH && 1 <= y && y <= HEIGHT;
    }

    /**
     * Hien.
     */
    public void removeAt(int x, int y) {
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i).getCoordinatesX() == x && pieces.get(i).getCoordinatesY() == y) {
                pieces.remove(i);
                break;
            }
        }
    }

    /**
     * Hien.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Hien.
     */
    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    /**
     * Hien.
     */
    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
