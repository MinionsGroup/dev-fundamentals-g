public class Main {

    public static void main(String[] arg) {
        Game game = new Game();

        Position bishop = new Position(1, 3);
        Piece bishopPiece = new Bishop(bishop);
        game.addPiece(bishopPiece);

        Position rock = new Position(1, 1);
        Piece rockPiece = new Rock(rock);
        game.addPiece(rockPiece);

        Position king = new Position(1, 5);
        Piece kingPiece = new King(king);
        game.addPiece(kingPiece);

        Position queen = new Position(1, 4);
        Piece queenPiece = new Queen(queen);
        game.addPiece(queenPiece);

        Position knight = new Position(1, 2);
        Piece knightPiece = new Knight(knight);
        game.addPiece(knightPiece);

        showPieceMove(bishopPiece, 3, 10);
        showPieceMove(rockPiece, 3, 1);
        showPieceMove(kingPiece, 5, 1);
        showPieceMove(queenPiece, 3, 5);
        showPieceMove(kingPiece, 2, 2);

    }

    private static void showPieceMove(Piece piece, int r, int c) {
        Position position = new Position(r, c);
        if (piece.isValidMove(position)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do!");
        }
    }
}
