import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Reading a movie from txt
        ReadMovie readMovie = new ReadMovie();
        readMovie.getMovies();
        String randomMovie = readMovie.getItemMovie();

        System.out.println(randomMovie);
        Word word = new Word(randomMovie);
        boolean hasWon = false;

        System.out.println("You are guessing " + word.displayUnderscores());
        Scanner scanner = new Scanner(System.in);
        // 10 times to guess
        for (int i = 10; i > 0; i--) {

            System.out.println("You have guessed " + "(" + word.getNumberOfWrongLetters() + ") wrong letters: " + word.getWrongCharEntered());

            System.out.println("Guess a letter: ");
            char letter = scanner.next().charAt(0);

            String wordGuessing = word.searchLetter(letter);
            System.out.println("You are guessing :" + wordGuessing);

            if (randomMovie.equals(wordGuessing)) {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("you Win!!");
            System.out.println("you have guessed: - " + randomMovie + " - correctly");
        } else {
            System.out.println("you do not have guessed: - " + randomMovie + " -  correctly");
            System.out.println("Game over ...you lose!!!!");
        }

    }
}
