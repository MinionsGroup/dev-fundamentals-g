package chess_exercise;

public class Bishop extends Piece {
    public boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.column - position.column) == Math.abs(newPosition.row - position.row)){
            return true;
        }
        else{
            return false;
        }
    }
}
