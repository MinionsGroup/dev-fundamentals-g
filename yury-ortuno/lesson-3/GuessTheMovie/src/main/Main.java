package main;

import java.util.Scanner;

/**
 * Created by Yury Ortuno on 12/3/2018.
 */
public class Main {
    public static void main(String[] Args) {
        GuessMovie guessMovie = new GuessMovie();
        Player player = new Player(guessMovie.getMovie());
        System.out.println("Start Game Guess the Movie!!!");
        while (player.getWrong() < guessMovie.getMaxTrying()) {
            guessMovie.guessing(player.getGuessingMovie());
            System.out.println();
            guessMovie.findLettersMovie(player, guessMovie.guessingLetter());
            guessMovie.wrong(player);
            if (guessMovie.gameOver(player)) break;
        }
    }
}
