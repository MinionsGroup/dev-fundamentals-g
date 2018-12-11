public class Knight extends Piece {
    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition))
            return false;
        if ((Math.abs(newPosition.getColumn() - this.position.getColumn())) *
                (Math.abs(newPosition.getColumn() - this.position.getColumn())) + (Math.abs(newPosition.getRow() -
                this.position.getRow())) * (Math.abs(newPosition.getRow() -
                this.position.getRow())) == 5) {
            return true;
        } else {
            return false;
        }
    }
}
