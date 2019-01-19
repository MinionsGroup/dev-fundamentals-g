package src;

public class Bishop extends Piece{
    private int column;
    private int row;

    boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.getColumn() - this.getColumn())== Math.abs(newPosition.getRow() - this.getRow())){
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
