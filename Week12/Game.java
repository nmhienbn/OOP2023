package Week12;

import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory = new ArrayList<>();

    /**
     * Hien.
     */
    public Game(Board board) {
        this.board = board;
    }

    /**
     * Hien.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece killedPiece = board.getAt(x, y);
            moveHistory.add(new Move(piece.getCoordinatesX(), x,
                    piece.getCoordinatesY(), y, piece, killedPiece));
            if (killedPiece != null) {
                board.removeAt(x, y);
            }
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    /**
     * Hien.
     */
    public Board getBoard() {
        return board;
    }

    /**
     * Hien.
     */
    public void setBoard(Board board) {
        this.board = board;
    }

    /**
     * Hien.
     */
    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
