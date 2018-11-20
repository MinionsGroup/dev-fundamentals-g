package practice_02;

import java.util.Scanner;

/**
 * Created by Daniel Cabero
 *
 * @since 18/11/2018.
 */
public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es)");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("Its smaller than " + guess + " guess(es)");
            } else if (randomNumber > guess) {
                System.out.println("Its greater than " + guess + " guess(es)");
            } else {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("CORRECT .,.,,,,, you win");
        } else {
            System.out.println("GAME OVER....... yuo lose");
            System.out.println("the number was :" + randomNumber);
        }
    }
}
