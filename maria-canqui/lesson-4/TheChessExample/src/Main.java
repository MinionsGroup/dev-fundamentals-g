public class Main {
    public static void main (String [] args) {
        Game game = new Game();

        Piece bishop = new Bishop(new Position(1,3));
        game.addPiece(bishop);
        isValidMovement(bishop,  new Position(1, 3));

        Piece rock = new Rock(new Position(1, 1));
        game.addPiece(rock);
        isValidMovement(rock,  new Position(1, 3));

        Piece king = new King(new Position(1, 5));
        game.addPiece(king);
        isValidMovement(king,  new Position(1, 5));

        Piece queen = new Queen(new Position(1, 4));
        game.addPiece(queen);
        isValidMovement(queen, new Position(1, 4));

        Piece knight = new Knight(new Position(1, 2));
        game.addPiece(knight);
        isValidMovement(knight,  new Position(1, 2));
    }

    public static void isValidMovement(Piece piece, Position position) {
        if(piece.isValidMove(position)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }
    }
}
