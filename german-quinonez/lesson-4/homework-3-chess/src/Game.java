public class Game {
    private Piece[][] board;

    Game() {
        setBoard(new Piece[8][8]);
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }

    public void addPiece(Piece piece) {
        board[piece.getPosition().getRow()][piece.getPosition().getRow()] = piece;
    }

    public int[] searchPiece(Piece piece) {
        int[] result = new int[3];
        for (int count = 0; count < board.length; count++) {
            for (int count2 = 0; count2 < board[count].length; count2++) {
                if (board[count][count2].equals(piece)) {
                    result[0] = count;
                    result[1] = count2;
                }
            }
        }
        return result;
    }
}
