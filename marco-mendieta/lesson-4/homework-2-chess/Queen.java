public class Queen extends Piece {

    @Override
    public boolean isValidMove(Position newPosition) {

        if ((newPosition.getColumn() == this.getPosition().getColumn() || newPosition.getRow() == this.getPosition().getRow()) ||
                Math.abs(newPosition.getColumn() - this.getPosition().getColumn()) == Math.abs(newPosition.getRow() -
                        this.getPosition().getRow())) {
            return super.isValidMove(newPosition);
        } else {
            return false;
        }
    }
}
