package day17;

public enum ChessPiece {
    KING_WHITE("♔", 100),
    KING_BLACK("♚", 100),
    QUEEN_WHITE("♕", 9),
    QUEEN_BLACK("♛", 9),
    ROOK_WHITE("♖", 5),
    ROOK_BLACK("♜", 5),
    BISHOP_WHITE("♗", 3.5),
    BISHOP_BLACK("♝", 3.5),
    KNIGHT_WHITE("♘", 3),
    KNIGHT_BLACK("♞", 3),
    PAWN_WHITE("♙", 1),
    PAWN_BLACK("♟", 1),
    EMPTY("_", -1);

    private String piece;
    private double value;

    ChessPiece(String s, double i) {
        this.piece = s;
        this.value = i;
    }

    public String getPiece() {
        return piece;
    }

    public double getValue() {
        return value;
    }

}
