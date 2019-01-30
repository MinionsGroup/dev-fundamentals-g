public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.column - position.column) == Math.abs(newPosition.row - position.row)){
            return true;
        }
        else{
            return false;
        }
    }
}
