package chess_exercise;

public class Queen extends Piece {
    public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(newPosition)){
            return false;
        }
        if(newPosition.column == newPosition.column && newPosition.row == newPosition.row){
            return true;
        }
        else{
            return false;
        }
    }
}
