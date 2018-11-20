import java.util.Scanner;

public class NumberGame {
    public static void main(String args[]) {
        int guessNumber = (int) (Math.random() * 100) + 1;
        boolean won = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome,Try to guess a number between 1-100");

        for (int count = 10; count > 0; count--) {
            System.out.println(String.format("You have %s opportunities,choose a number: ", count));
            int guess = scanner.nextInt();
            if (guessNumber < guess) {
                System.out.println(String.format("It's smaller than %s", guess));
            } else if (guessNumber > guess) {
                System.out.println(String.format("It's greater than %s", guess));
            } else {
                System.out.println("Congratulations,You WIN!!!");
                won = true;
                break;
            }
        }
        if (!won) {
            System.out.println("Sorry,You lose =(");
            System.out.println(String.format("The number was: %s", guessNumber));
        }
    }
}
