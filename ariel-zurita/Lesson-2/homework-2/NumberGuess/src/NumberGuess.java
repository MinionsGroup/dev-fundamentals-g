import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args){
        Random ran = new Random();
        int numberGenerated = ran.nextInt(100) + 1;
        boolean youWon = false;
        for (int attempt = 9; attempt > 0; attempt --){
            System.out.print("Guess the number: ");
            Scanner sca = new Scanner(System.in);
            int numberGuess = sca.nextInt();
            if (numberGuess > numberGenerated){
                System.out.println(numberGuess + " is greater than number generated");
            }else if (numberGuess < numberGenerated){
                System.out.println(numberGuess + " is lower than number generated");
            }else{
                youWon = true;
                break;
            }
            System.out.println("You have " + attempt + " attempt: Try again: ");
        }
        if (youWon){
            System.out.println("You win");
        }else{
            System.out.println("Game over, the number was: " + numberGenerated);
        }
    }
}
