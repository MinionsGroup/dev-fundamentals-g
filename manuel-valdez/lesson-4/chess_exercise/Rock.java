package chess_exercise;

public class Rock extends Piece {
    private String name;

    public Rock(){
        super();
        name = "rock";
    }

    public boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position)){
            return false;
        }
        if(newPosition.column == position.column || newPosition.row == position.row){
            return true;
        }
        else{
            return false;
        }
    }
}
