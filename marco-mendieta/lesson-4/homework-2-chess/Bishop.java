public class Bishop extends Piece{

    boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.getColumn() - this.getPosition().getColumn()) == Math.abs(newPosition.getRow() - this.getPosition().getRow())){
            return true;
        }
        else{
            return false;
        }
    }

}
