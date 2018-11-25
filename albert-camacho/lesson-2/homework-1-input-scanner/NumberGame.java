import java.util.Scanner;

public class NumberGame {
    public static void main(String arg[]) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("I have chosen a number between 1 to 100.");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose: ");
            int guess = scanner.nextInt();

            if (randomNumber > guess) {
                System.out.println("It is greater than " + guess);
            } else if (randomNumber < guess) {
                System.out.println("It is smaller than " + guess);
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("YOU WIN!!!");
        } else {
            System.out.println("GAME OVER YOU LOST!!!");
            System.out.println("The number was: " + randomNumber);
        }
    }
}
