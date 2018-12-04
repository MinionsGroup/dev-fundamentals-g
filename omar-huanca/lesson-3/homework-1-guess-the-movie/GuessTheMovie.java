import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheMovie {
    private Scanner scanner;
    private String movieTitle;
    private char movieTitleAsterisks[];
    private boolean isEntered[];
    private int spaces;
    private int movieLength;
    private int score;

    GuessTheMovie() {
        this.scanner = new Scanner(System.in);
        this.movieTitle = randomMovie();
        this.movieTitleAsterisks = new char[movieTitle.length()];
        this.isEntered = new boolean[movieTitle.length()];
        this.spaces = 0;
        this.score = 5;
        movieEncrypted();
        this.movieLength = movieTitle.length() - spaces;
    }

    private int randomMovieNumber() {
        return (int) (Math.random() * 25);
    }

    private String randomMovie() {
        File moviesFile = new File("dev-fundamentals-g/omar-huanca/lesson-3/homework-1-guess-the-movie/movies.txt");
        Scanner movieScanner = null;
        try {
            movieScanner = new Scanner(moviesFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        ArrayList<String> movies = new ArrayList<String>();
        while (movieScanner.hasNextLine()) {
            String line = movieScanner.nextLine();
            movies.add(line);

        }
        movieScanner.close();
        return movies.get(randomMovieNumber());
    }

    private void movieEncrypted() {
        for (int i = 0; i < movieTitle.length(); i++) {
            if (movieTitle.charAt(i) == ' ') {
                spaces++;
            } else {
                movieTitleAsterisks[i] = '*';
            }
        }
        System.out.println(movieTitleAsterisks);
    }

    public void playGame() {
        boolean isCorrect = false;
        System.out.println();
        System.out.print("Enter a letter to guess :");
        char character = Character.toLowerCase(scanner.next().charAt(0));

        for (int index = 0; index < movieTitle.length(); index++) {
            if (movieTitle.charAt(index) == character && !isEntered[index]) {
                movieTitleAsterisks[index] = character;
                isEntered[index] = true;
                isCorrect = true;
                break;
            }
        }

        if (!isCorrect) {
            score--;
        } else
            movieLength--;

        for (char movieTitleAsterisk : movieTitleAsterisks) {
            System.out.print(movieTitleAsterisk);
        }
        System.out.println("\nAvailable Attempts : " + score);
    }

    boolean isGameOver() {
        return score < 1 || movieLength == 0;
    }

    void checkScore() {
        if (score >= 1)
            System.out.println("You won congrats");
        else
            System.out.println("You lost! try again, Movie was : " + movieTitle);
    }

}