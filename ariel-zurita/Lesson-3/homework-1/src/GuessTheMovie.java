import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GuessTheMovie {
    String movieName;
    int points;
    public GuessTheMovie(int points){
        this.movieName = null;
        this.points = points;
    }
    public void setMovieName(String movie){
        this.movieName = movie;
    }
    public String getMovieName(){
        return movieName;
    }
    public String selectAMovie(){
        File file = new File("Movies.txt");
        String movie = null;
        try{
            Scanner movies = new Scanner(file);
            ArrayList<String> movieList = new ArrayList<>();
            while (movies.hasNextLine()){
                movieList.add(movies.nextLine());
            }
            int limit = movieList.size();
            Random rand = new Random();
            int numberOfMovie = rand.nextInt(limit) + 1;
            movie = movieList.get(numberOfMovie);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return movie;
    }
    public ArrayList<Character> hideMovieName(String movieName){
        ArrayList<Character> hiddenName = new ArrayList<>();
        for (char c:movieName.toCharArray()){
            if (c != ' '){
                hiddenName.add('_');
            }else{
                hiddenName.add(' ');
            }
        }
        return hiddenName;
    }

    public static void main(String[] args){
        GuessTheMovie guessMovie = new GuessTheMovie(10);
        Game game = new Game();
        int attempts = 0;
        boolean inGame = true;
        int counter = 0;

        StringBuilder wrongChars = new StringBuilder();

        guessMovie.setMovieName(guessMovie.selectAMovie());
        String movieName = guessMovie.getMovieName();
        ArrayList<Character> hiddenChars = guessMovie.hideMovieName(guessMovie.getMovieName());

        while (inGame && attempts < guessMovie.points){
            String printArrayList = game.printArrayList(hiddenChars);
            if (guessMovie.getMovieName().equals(printArrayList)){
                int remainingPoints = guessMovie.points - attempts;
                System.out.println("You Win!! Points " + remainingPoints);
                inGame = false;
                break;
            }else{
                System.out.println("You are guessing: " + printArrayList);
                System.out.println("You have guessed (" + counter + ") wrong letters: " + wrongChars.toString());
                char character = game.userInput("Guess a letter: " );
                if (!game.replaceChar(movieName, hiddenChars, character)){
                    wrongChars.append(character);
                    counter++;
                }
                attempts++;
            }
        }
        if (attempts == guessMovie.points){
            System.out.println("You lose the movie was: " + guessMovie.getMovieName());
        }
    }
}
