package chess.piece;

import chess.Piece;
import chess.Position;

public class King extends Piece {

    public King(Position position) {
        super(position);
    }

    @Override
    public boolean isValidMove(Position newPosition) {
        if (!super.isValidMove(newPosition))
            return false;
        if (Math.abs(newPosition.getColumn() - position.getColumn()) <=1 &&
                Math.abs(newPosition.getRow() - position.getRow()) <=1) {
            return true;
        } else {
            return false;
        }
    }
}
