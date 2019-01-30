import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = String.format("%s%s", System.getProperty("user.dir"),
                "\\escarleth-ledezma\\lesson-3\\guess_the_movie_game\\resources\\MovieTitles.txt");
        System.out.println("***********Welcome,Guess The Movie***********");
        GuessMovieGame guessMovieGame = new GuessMovieGame(readMovieList(path));
        guessMovieGame.playGuessGame();
    }

    private static List<String> readMovieList(String filePath) throws FileNotFoundException {
        List<String> movieList = new ArrayList<>();
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            movieList.add(scanner.nextLine());
        }
        return movieList;
    }
}
