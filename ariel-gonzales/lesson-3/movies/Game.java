
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private List<String> multimedia = new ArrayList<>();
    private String movie;
    private String hideMovie;
    private StringBuilder wrongWords;
    private int contWrongWords;

    public Game() {
        this.movie = "";
        this.hideMovie = "";
        wrongWords = new StringBuilder();
        contWrongWords = 0;
    }

    public void readFile() throws FileNotFoundException {
        File file = new File("ariel-gonzales\\lesson-3\\movies\\movies");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            multimedia.add(scanner.nextLine());
        }
    }

    private String randomMovie() {
        return multimedia.get(new Random().nextInt(multimedia.size()));
    }

    private String hideMovie(String movie) {
        return movie.replaceAll("[a-z]", "_");
    }

    private void selectRandomMovie() {

        this.movie = randomMovie();
        this.hideMovie = hideMovie(this.movie);
    }

    private String replaceLetters(char letter) {
        StringBuilder mov = new StringBuilder(this.hideMovie);
        doesNotContains(letter);
        for (int i = 0; i < this.movie.length(); i++) {
            if (this.movie.charAt(i) == letter) {
                mov.setCharAt(i, letter);
            }
        }
        this.hideMovie = mov.toString();
        return mov.toString();
    }

    public String playing() {
        selectRandomMovie();

        for (int i = 0; i < this.movie.length(); i++) {
            if (this.multimedia.contains(this.hideMovie)) {
                System.out.println("You Win");
                break;
            }
            System.out.println(String.format("You are guessing: %s", this.hideMovie));
            System.out.println(String.format("You have guessed (%d) wrong letters: %s", this.contWrongWords, this.wrongWords.toString()));
            char letter = readScanner();
            replaceLetters(letter);
        }
        return "You Lose";

    }

    private void doesNotContains(char letter) {

        if (!(this.movie.indexOf(letter) > -1)) {
            this.wrongWords.append(letter);
            ++this.contWrongWords;
        }
    }

    public char readScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("Guess a letter: "));
        return sc.next().charAt(0);
    }

}
