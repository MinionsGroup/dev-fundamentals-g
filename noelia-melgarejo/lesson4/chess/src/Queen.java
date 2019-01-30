package src;

public class Queen extends Piece {
    private int column;
    private int row;

    boolean isValidMove(Position newPosition){
        if( (Math.abs(newPosition.getColumn() - this.getColumn())== Math.abs(newPosition.getRow() - this.getRow()))
                ||  (newPosition.getColumn() == this.getColumn() && newPosition.getRow() == newPosition.getColumn())){
            return true;
        }else {
            return false;
        }

    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
