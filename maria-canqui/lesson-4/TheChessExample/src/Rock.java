public class Rock extends Piece  {

    public Rock(Position position) {
        super(position);
    }

    @Override
    boolean isValidMove(Position newPosition){
        if(newPosition.column == position.column || newPosition.row == position.row){
            return true;
        }
        else{
            return false;
        }
    }
}
