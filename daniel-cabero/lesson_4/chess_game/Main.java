package lesson_4.chess_game;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class Main {
    public static void main(String[] args){
        Queen queen = new Queen();
        Position testPosition = new Position(3,10);
        if(queen.isValidMove(testPosition)){
            System.out.println("Yes, I can move there.");
        }
        else{
            System.out.println("Nope, can't do!");
        }

    }
}
