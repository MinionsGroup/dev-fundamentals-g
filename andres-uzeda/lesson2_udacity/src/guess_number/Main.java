package guess_number;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("I have a number between 1-100");
        System.out.println("Could you know which number is it?");
        GuessNumber game = new GuessNumber();
        while(game.TheGameFinish()){
            Scanner scanner = new Scanner(System.in);
            int playerNumber = scanner.nextInt();
            game.ItIsTheNumber(playerNumber);
        }
    }
}
