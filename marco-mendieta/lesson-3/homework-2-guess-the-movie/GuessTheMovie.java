import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheMovie {

    private ArrayList <String> movies;
    private String movieName;
    private int pointsLost;
    private String wrongLetters;
    private String rightLetters;
    private boolean gameWon;

    //constructor intializing MovieList
    public GuessTheMovie() {
        movieName = getRandomMovie().trim();
        pointsLost = 0;
        rightLetters = "";
        wrongLetters = "";
        gameWon = false;
    }

    // setters and getters
    public String getMovieName() {
        return movieName;
    }

    public String getWrongLetters() {
        return wrongLetters;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public int getPointsLost() {
        return pointsLost;
    }

    public String getMovieNameHidden(){
        if (rightLetters.equals("")){
            return movieName.replaceAll("[a-zA-Z]", "_");
        }
        else{
            return movieName.replaceAll("[a-zA-Z&&[^" + rightLetters + "]]", "_");
        }
    }

    public String getRandomMovie()
    {
        movies = new ArrayList();
        int movieIndex = (int) (Math.random() * movies.size());

        File file = new File("movies.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                movies.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        }
        return movies.get(movieIndex);
    }

    public void insertLetter(){
        System.out.println("Guess the letter: ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine().toLowerCase();
        if (movieName.toLowerCase().contains(letter)){
            rightLetters += letter + letter.toUpperCase();
        }
        else {
            pointsLost++;
            wrongLetters += " " + letter;
        }
    }

    public boolean gameEnded(){
        if (getWrongLetters().length()/2 >= 10){
            return true;
        }
        if(!getMovieNameHidden().contains("_")){
            gameWon = true;
            return true;
        }
        return false;
    }

    public static void main(String [] args) throws FileNotFoundException {

        GuessTheMovie game = new GuessTheMovie();

        while(!game.gameEnded()){
            System.out.println("Movie hidden:" + game.getMovieNameHidden());
            System.out.println("Wrong attempts: " + game.getWrongLetters().length()/2 + " wrong letters:"
                    + game.getWrongLetters());
            game.insertLetter();
        }
        if(game.isGameWon()){
            System.out.println("You win!");
            System.out.println("Te movie title is: " + game.getMovieName());
        }
        else{
            System.out.println("You spend all your attempts " + game.getWrongLetters().length()/2 + "  :" +
                    game.getWrongLetters());
            System.out.println("You lost!");
            System.out.println("The movie title was " + game.getMovieName());
        }

    }
}
