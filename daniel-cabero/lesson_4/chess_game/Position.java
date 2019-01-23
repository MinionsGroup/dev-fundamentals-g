package lesson_4.chess_game;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
class Position {
    int row;
    int column;

    // Constructor using row and column values
    Position(int r, int c) {
        this.row = r;
        this.column = c;
    }

    boolean isValidMove(Position newPosition) {
        if (newPosition.row > 0 && newPosition.column > 0
                && newPosition.row < 8 && newPosition.column < 8) {
            return true;
        } else {
            return false;
        }
    }

}