import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieGame {

    private String movieToGuess;
    private List<String> movieGuessed;
    private int userPoints;

    public MovieGame(){
        try {
            movieToGuess = getMovie();
        } catch (FileNotFoundException ex){
            System.out.println("File src\\movies.txt not found.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        userPoints = 2;
    }

    private Scanner loadMovies() throws Exception {
        File file = new File("src\\movies.txt");
        return new Scanner(file);
    }

    private List<String> getListOfMovies() throws Exception {
        Scanner movies = loadMovies();
        List<String> moviesList = new ArrayList<>();
        while (movies.hasNextLine()) {
            moviesList.add(movies.nextLine());
        }
        return moviesList;
    }

    private String getMovie() throws Exception {
        int randomNumber = (int) (Math.random() * 25);
        return getListOfMovies().get(randomNumber);
    }

    private void showWordToGuess() {
        movieGuessed = new ArrayList<>();
        System.out.println(movieToGuess);
        for (String letter : movieToGuess.split("")) {
            if (!" ".equals(letter)) {
                movieGuessed.add("_");
            } else {
                movieGuessed.add(" ");
            }
        }
    }

    private void readUserLetter() {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        if (movieToGuess.contains(letter)) {
            addLetterToMovie(letter);
        } else {
            userPoints--;
        }
    }

    private void addLetterToMovie(String letter) {
        int position = 0;
        for (String letters : movieToGuess.split("")) {
            if (letter.equals(letters)) {
                movieGuessed.set(position, letter);
            }
            position++;
        }
    }

    public void startGame(){
        showWordToGuess();
        while (userPoints > 0 || movieGuessed.toString() != movieToGuess) {
            System.out.println("The movie is: " + movieGuessed);
            System.out.println("Fill in with a letter: ");
            readUserLetter();
        }

        System.out.println(String.format("You've lost, the movie was: ", movieToGuess));
    }
}
