import javafx.geometry.Pos;

public class Piece {
    private Position position;

    boolean isValidMove(Position newPosition){
        if(newPosition.getRow()>0 && newPosition.getColumn()>0
                && newPosition.getRow()<8 && newPosition.getColumn()<8){
            return true;
        }
        else{
            return false;
        }
    }

    public Position getPosition() {
        return position;
    }
}
