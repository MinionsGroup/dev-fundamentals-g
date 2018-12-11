package lesson_4.chess_game;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
class Piece {
    String name;
    Position position;

    boolean isValidMove(Position newPosition) {
        if (newPosition.row > 0 && newPosition.column > 0
                && newPosition.row < 8 && newPosition.column < 8) {
            return true;
        } else {
            return false;
        }
    }
}
