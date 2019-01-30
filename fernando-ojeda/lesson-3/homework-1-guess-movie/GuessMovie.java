package com.company;

import java.util.ArrayList;
import java.util.List;

public class GuessMovie {
    private List<String> movies;
    private List<Character> movieCharacters;
    private List<Character> guessSymbols;

    GuessMovie(){
        FileGuessMovie fileGuessMovie = new FileGuessMovie();
        movieCharacters = new ArrayList<>();
        movies = fileGuessMovie.readFile();
        guessSymbols = new ArrayList<>();
    }

    public String getMovie(){
        String movie;
        int num = (int) ((Math.random()*(movies.size()-1))+1);
        movie = movies.get(num);
        return movie;
    }

    public void addCharData(String movie) {
        for (int count = 0; count < movie.length(); count++){
            char letter = movie.charAt(count);
            movieCharacters.add(letter);
            guessSymbols.add('_');
        }
    }

    public List<Character> getMovieCharacters(){
        return movieCharacters;
    }

    public List<Character> getGuessSymbols(){
        return guessSymbols;
    }

    public String repleceMovie(String movie) {
        String result = movie.replace(" ", "_");
        return result;
    }

    public void showGuestMovie() {
        for (int count = 0; count < guessSymbols.size(); count++){
            System.out.print(guessSymbols.get(count));
        }
    }

    public String generateSymbol() {
        String result = "";
        for (int count = 0; count < guessSymbols.size(); count++){
            result = result + guessSymbols.get(count);
        }
        return result;
    }

    public boolean verifyWinGame(String movie2) {
        if(generateSymbol().equals(movie2)){
            System.out.println("\nYou win!");
            System.out.println("You have guessed '" + generateSymbol() + "' correctly");
            return true;
        }
        return false;
    }
}
