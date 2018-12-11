package src;

public class Rock extends Piece {
    private int column;
    private int row;
    private String name;

    boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition)) {
            return false;
        }

        // If we passed the first test then check for the specific rock movement
        if (newPosition.getColumn() == this.column && newPosition.getRow() == this.row) {
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return column;
    }
}
