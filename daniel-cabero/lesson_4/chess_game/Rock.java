package lesson_4.chess_game;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
class Rock extends Piece{

    public Rock(){
        super();
        this.name = "rock";
    }

    boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position)){
            return false;
        }
        if(newPosition.column == this.position.column && newPosition.row == this.position.row){
            return true;
        }
        else{
            return false;
        }
    }
}