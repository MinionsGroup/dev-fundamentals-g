public class Game {
    Piece [][] board;
    // Constructor creates an empty board
    Game(){
        board = new Piece[8][8];
    }

    public void addPiece(Piece piece){
        board[piece.getPosition().getRow()][piece.getPosition().getRow()] = piece;
    }
}
