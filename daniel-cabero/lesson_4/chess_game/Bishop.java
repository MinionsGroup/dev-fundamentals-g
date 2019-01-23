package lesson_4.chess_game;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
class Bishop extends Piece{
    boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.column - this.position.column) == Math.abs(newPosition.row - this.position.row)){
            return true;
        }
        else{
            return false;
        }
    }
}
