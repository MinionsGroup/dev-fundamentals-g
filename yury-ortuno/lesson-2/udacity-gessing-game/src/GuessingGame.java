import java.util.Scanner;

/**
 * Created by Yury Ortuno on 11/19/2018.
 */
public class GuessingGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have a number between 1 and 100.");
        System.out.println("Can you guess what number it is?");
        System.out.println("you can try it 10 times");
        System.out.println("Enter the number:");
        Scanner read = new Scanner(System.in);
        int guess;
        boolean hasWon = false;
        for (int i = 1; i <= 10; i++) {
            guess = read.nextInt();
            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + ".");
            } else if (randomNumber > guess) {
                System.out.println("It's greater than " + guess + ".");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("CORRECT... YOU WIN!!!");
        } else {
            System.out.println("GAME OVER... YOU LOSE!!!");
            System.out.println("The number was : " + randomNumber);
        }
    }
}
