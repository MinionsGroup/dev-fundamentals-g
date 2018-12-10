package chess.piece;

import chess.Piece;
import chess.Position;

public class Queen extends Piece {

    public Queen(Position position){
        super(position);
    }

    public boolean isValidMove(Position newPosition){
        if((newPosition.getColumn() == position.getColumn() || newPosition.getRow() == position.getRow()) ||
           (Math.abs(newPosition.getColumn() - position.getColumn()) ==
                   Math.abs(newPosition.getRow() - position.getRow()))){
            return true;
        }
        else{
            return false;
        }
    }
}
