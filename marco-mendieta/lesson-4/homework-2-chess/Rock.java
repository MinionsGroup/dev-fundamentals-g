public class Rock extends Piece {

    private String name;

    // default constructor
    public Rock(){
        super(); // this will call the parent's constructor
        this.name = "rock";
    }

    boolean isValidMove(Position newPosition){
        if(newPosition.getColumn() == this.getPosition().getColumn() || newPosition.getRow() == this.getPosition().getRow()){
            return true;
        }
        else{
            return false;
        }
    }

}
