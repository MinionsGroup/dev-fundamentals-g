public class Position {
    private int row;
    private int column;
    // Constructor using row and column values
    Position(int r, int c){
        this.row = r;
        this.column = c;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
