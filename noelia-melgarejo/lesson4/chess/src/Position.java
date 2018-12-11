package src;

public class Position {

    protected int row;
    protected int column;

    Position(int row, int column ){
        this.row = row;
        this.column  = column;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }
}
