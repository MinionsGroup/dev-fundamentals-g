package guess_the_movie;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        boolean playAgain = false;
        while (!playAgain) {
            GuessTheMovieGame game = new GuessTheMovieGame();
            game.startTheGame();
            while (game.TheGameFinish()) {
                game.printTheMovieNameInTheGame();
                game.printWrongLetter();
                System.out.println("\n");
                System.out.println("Insert a letter the name of this movie: ");
                Scanner scanner = new Scanner(System.in);
                char letter = scanner.next(".").charAt(0);
                game.guessALetterInTheMovie(letter);
                System.out.println("\n");
            }
            playAgain = Utils.playAgain(keyboard);
        }
    }
}
