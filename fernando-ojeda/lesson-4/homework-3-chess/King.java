public class King extends Piece {

    public King(Position position) {
        super(position);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition))
            return false;
        if (Math.abs(newPosition.getColumn() - this.position.getColumn()) <=1 && Math.abs(newPosition.getRow() -
                this.position.getRow()) <=1) {
            return true;
        } else {
            return false;
        }
    }
}
