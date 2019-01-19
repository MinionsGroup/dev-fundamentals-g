public class Piece {

    Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    boolean isValidMove(Position newPosition){
        if(newPosition.row>0 && newPosition.column>0
                && newPosition.row<8 && newPosition.column<8){
            return true;
        }
        else{
            return false;
        }
    }
}
