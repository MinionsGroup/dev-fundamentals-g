import chess.Game;
import chess.Piece;
import chess.Position;
import chess.piece.Bishop;
import chess.piece.King;
import chess.piece.Queen;
import chess.piece.Rock;

public class MainTask2 {

    public static void main(String[] args) {
        Game game = new Game();

        Position bishop = new Position(0,1);
        Piece bishopPiece = new Bishop(bishop);
        game.addPiece(bishopPiece);

        Position rock = new Position(7, 1);
        Piece rockPiece = new Rock(rock);
        game.addPiece(rockPiece);

        Position king = new Position(1, 4);
        Piece kingPiece = new King(king);
        game.addPiece(kingPiece);

        Position queen = new Position(1, 5);
        Piece queenPiece = new Queen(queen);
        game.addPiece(queenPiece);

        printIfMove(bishopPiece, 5, 10);
        printIfMove(rockPiece, 7,     6);
        printIfMove(kingPiece, 1, 3);
        printIfMove(queenPiece, 3, 5);
        printIfMove(kingPiece, 2, 2);
    }

    private static void printIfMove(Piece piece, int r, int c) {
        Position position = new Position(r, c);
        if(piece.isValidMove(position)){
            System.out.println(piece.getClass().getSimpleName() + " can move to: " + r + ", " + c);
        }else {
            System.out.println(piece.getClass().getSimpleName() + " can't move to: " + r + ", " + c);
        }
    }
}