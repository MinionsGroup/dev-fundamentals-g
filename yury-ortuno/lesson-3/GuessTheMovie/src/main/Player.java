package main;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yury Ortuno on 12/3/2018.
 */
public class Player {
    private int wrong;
    private List<Character> wrongLetters;
    private char[] guessingMovie;

    Player(String guessingMovie) {
        wrong = 0;
        wrongLetters = new LinkedList<>();
        this.guessingMovie = guessingMovie.replaceAll("[a-z]", "_").toCharArray();
    }

    public List<Character> getTrying() {
        return wrongLetters;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrongLetter(char character) {
        wrongLetters.add(character);
    }

    public List<Character> getWrongLetter() {
        return wrongLetters;
    }

    public void addWrong() {
        this.wrong++;
    }

    public void setGuessingMovie(char[] guessingMovie) {
        this.guessingMovie = guessingMovie;
    }

    public char[] getGuessingMovie() {
        return guessingMovie;
    }

}
