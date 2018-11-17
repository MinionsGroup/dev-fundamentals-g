import java.util.Random;
import java.util.Scanner;

/**
 * This class is create a Number Game object
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class NumberGame {
    private int winnerNumber;
    private int maxNumber;
    private Random random;
    private Scanner scanInput;
    private int tries;
    private int inputNumber;
    private boolean isWinner;

    /**
     * Constructor for Number Game.
     * This method is for initialize Number Game attributes
     *
     * @param maxNumber, This is a max number
     * @param tries,     This is tries to play
     */
    public NumberGame(int maxNumber, int tries) {
        this.random = new Random();
        this.scanInput = new Scanner(System.in);
        this.maxNumber = maxNumber;
        this.winnerNumber = this.getWinnerNumber();
        this.inputNumber = 0;
        this.tries = tries;
        this.isWinner = false;
    }

    /**
     * This method is to start the game
     */
    public void startGame() {
        System.out.println("========= Number Guessing Game ==========");
        int index = 1;
        while (index <= tries) {
            System.out.println("[" + index + "] - Please insert guess a number between 1 and " + maxNumber + ": ");
            inputNumber = scanInput.nextInt();
            if (inputNumber == winnerNumber) {
                isWinner = true;
                break;
            } else if (inputNumber < winnerNumber) {
                System.out.println("Number is to low, try again");
                index++;
            } else {
                System.out.println("Number is to high, try again");
                index++;
            }
        }
        this.printResults(index);
    }

    /**
     * This method is to print final results
     *
     * @param index, This is a number of tries
     */
    private void printResults(int index) {
        if (isWinner) {
            System.out.println("========= Result==========");
            System.out.println("You win!");
            System.out.println("It took you " + index + " trie(s).");
        } else {
            System.out.println("========= Result==========");
            System.out.println("You lose!");
            System.out.println("It took you " + index + " trie(s).");
        }
    }

    /**
     * This method is to get a random number between 1 to max number
     */
    private int getWinnerNumber() {
        return random.nextInt(maxNumber);
    }

}
