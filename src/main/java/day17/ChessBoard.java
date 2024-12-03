package day17;

public class ChessBoard {
    private static final int SIZE = 8;
    private ChessPiece[][] chessBoard;

    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public ChessPiece[][] getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print(){
        for(int counterY = 0; counterY < chessBoard.length; counterY++){
            for(int counterX = 0; counterX < chessBoard.length; counterX++){
                System.out.print(chessBoard[counterY][counterX].getPiece());
            }
            System.out.println();
        }
    }
}
