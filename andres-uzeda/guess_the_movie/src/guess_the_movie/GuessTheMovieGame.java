package guess_the_movie;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GuessTheMovieGame {
    private int attempts;
    private boolean isItTheMovieName;
    private char[] movieName;
    private ArrayList<String> wrongLetters;
    private char[] movieNameInTheGame;

    public GuessTheMovieGame() throws FileNotFoundException {
        this.attempts = 10;
        this.isItTheMovieName = false;
        this.movieName = Utils.aMovieInAfile("src/guess_the_movie/list_movies.txt");
        this.wrongLetters = new ArrayList<>();
        this.movieNameInTheGame = new char[movieName.length];
    }

    public boolean TheGameFinish(){
        areThereAUnderscoreInTheArray();
        if(AttemptsAreZero() == true || isItTheMovieName == true){
            return false;
        }else{
            return true;
        }
    }

    private boolean AttemptsAreZero(){
        if(attempts == 0){
            System.out.println("You don´t have more attempts");
            return true;
        }else{
            return false;
        }
    }

    public void printWrongLetter(){
        System.out.print("("+wrongLetters.size()+") Wrong Letters: ");
        for (String letter : wrongLetters){
            System.out.print(letter+" ");
        }
    }

    private void fillUpTheMovieNameInTheGame(){
        for (int index = 0; index < movieNameInTheGame.length; index++ ){
            movieNameInTheGame[index] = '_';
        }
    }

    public void printTheMovieNameInTheGame(){
        System.out.println("\n");
        for (char letter : movieNameInTheGame){
            System.out.print(letter);
        }
    }

    public void guessALetterInTheMovie(char letter){
        String temporalNameMovie = String.valueOf(movieNameInTheGame);
        guessALetterInTheMovieInTheGame(letter);
        if(String.valueOf(movieNameInTheGame).equals(temporalNameMovie)){
            wrongLetters.add(String.valueOf(letter));
            attempts = attempts -1;
        }
    }

    private void guessALetterInTheMovieInTheGame(char letter){
        for (int index = 0; index < movieName.length; index++ ){
            if(movieName[index] == letter){
                movieNameInTheGame[index] = letter;
            }
        }
    }

    private void areThereAUnderscoreInTheArray(){
        if(String.valueOf(movieNameInTheGame).contains("_")){
            isItTheMovieName = false;
        }else{
            System.out.println("the name of the movie is:");
            printTheMovieNameInTheGame();
            System.out.println("\n");
            System.out.println("You Win");
            isItTheMovieName = true;
        }
    }

    public void startTheGame(){
        fillUpTheMovieNameInTheGame();
        guessALetterInTheMovieInTheGame(' ');
    }
}
