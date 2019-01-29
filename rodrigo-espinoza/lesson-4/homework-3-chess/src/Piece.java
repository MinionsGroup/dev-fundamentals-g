public class Piece {
    protected Position position;

    public Piece(Position position){
        this.position = position;
    }

    public boolean isValidMove(Position newPosition){
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

    public void setPosition(Position position) {
        this.position = position;
    }
}
