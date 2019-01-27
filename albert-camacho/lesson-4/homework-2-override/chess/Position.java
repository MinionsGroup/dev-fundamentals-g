package chess;

public class Position {
    private int row;

    private int column;

    public Position(int r, int c) {
        this.row = r;
        this.column = c;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}
