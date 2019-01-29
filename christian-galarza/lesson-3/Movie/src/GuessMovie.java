import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessMovie {
    private Scanner scanner;
    private char movieTitle[];
    private boolean isEntered[];
    private String movieTitleSelected;
    private int space;
    private int movieLength;
    private int attempts;

    GuessMovie() {
        this.scanner = new Scanner(System.in);
        this.movieTitleSelected = readMovies();
        this.movieTitle = new char[movieTitleSelected.length()];
        this.isEntered = new boolean[movieTitleSelected.length()];
        this.space = 0;
        this.attempts = 5;
        movieEncrypted();
        this.movieLength = movieTitleSelected.length() - space;
    }
    private int selectRandomMovieNumber() {
        return (int) (Math.random() * 25);
    }
    private String readMovies() {
        File moviesFile = new File("dev-fundamentals-g/christian-galarza/lesson-3/Movie/list-movies.txt");
        Scanner movieScanner = null;
        try {
            movieScanner = new Scanner(moviesFile);
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }
        ArrayList<String> movies = new ArrayList<String>();
        while (movieScanner.hasNextLine()) {
            String line = movieScanner.nextLine();
            movies.add(line);
        }
        movieScanner.close();
        return movies.get(selectRandomMovieNumber());
    }
    private void movieEncrypted() {
        for (int i = 0; i < movieTitleSelected.length(); i++) {
            if (movieTitleSelected.charAt(i) == ' ') {
                space++;
            } else {
                movieTitle[i] = '_';
            }
        }
        System.out.println(movieTitle);
    }
    public void startGame() {
        boolean isCorrect = false;
        System.out.println();
        System.out.print("Enter a letter please : ");
        char character = Character.toLowerCase(scanner.next().charAt(0));
        for (int index = 0; index < movieTitleSelected.length(); index++) {
            if (movieTitleSelected.charAt(index) == character && !isEntered[index]) {
                movieTitle[index] = character;
                isEntered[index] = true;
                isCorrect = true;
                break;
            }
        }
        if (!isCorrect) {
            attempts--;
        } else
            movieLength--;
        for (char movieTitleAsterisk : movieTitle) {
            System.out.print(movieTitleAsterisk);
        }
        System.out.println("\nNumber of Attempts : " + attempts);
    }
    boolean toLose() {
        return attempts < 1 || movieLength == 0;
    }
    void toWonGame() {
        if (attempts >= 1)
            System.out.println("You won congrats");
        else
            System.out.println("Game Over \n  Movie was : " + movieTitleSelected);
    }
}
