public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition))
            return false;
        if (Math.abs(newPosition.getColumn() - this.position.getColumn()) == Math.abs(newPosition.getRow() -
                this.position.getRow())) {
            return true;
        } else {
            return false;
        }
    }
}
