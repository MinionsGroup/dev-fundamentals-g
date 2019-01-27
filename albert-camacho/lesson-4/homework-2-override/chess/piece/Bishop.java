package chess.piece;

import chess.Piece;
import chess.Position;

public class Bishop extends Piece {

    public Bishop(Position position) {
        super(position);
    }

    public boolean isValidMove(Position newPosition){
        if(Math.abs(newPosition.getColumn() - position.getColumn()) ==
                Math.abs(newPosition.getRow() - position.getRow())){
            return true;
        }
        else{
            return false;
        }
    }
}
