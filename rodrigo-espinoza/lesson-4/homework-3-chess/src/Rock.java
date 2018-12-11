public class Rock extends Piece {

    public Rock(Position position) {
        super(position);
    }

    @Override
    public boolean isValidMove(Position newPosition){
        if (!super.isValidMove(newPosition))
            return false;
        if(newPosition.getColumn() == this.position.getColumn() || newPosition.getRow()== this.position.getRow()){
            return true;
        }
        else{
            return false;
        }
    }
}
