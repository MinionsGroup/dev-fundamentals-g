package chess.piece;

import chess.Piece;
import chess.Position;

public class Rock extends Piece {

    public Rock(Position position) {
        super(position);
    }

    public boolean isValidMove(Position newPosition){
        if(newPosition.getColumn() == position.getColumn() || newPosition.getRow() == position.getRow()){
            return true;
        }
        else{
            return false;
        }
    }
}
