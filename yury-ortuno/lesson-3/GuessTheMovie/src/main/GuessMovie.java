package main;

import java.util.Scanner;

/**
 * Created by Yury Ortuno on 12/3/2018.
 */
public class GuessMovie {
    private int maxTrying;
    private String movie;
    Movie movies;

    GuessMovie() {
        maxTrying = 10;
        movies = new Movie();
    }

    public String getMovie() {
        movie = movies.getRandomMovie();
        return movie;
    }

    public int getMaxTrying() {
        return maxTrying;
    }

    public void roles() {
        System.out.println("you have " + maxTrying + " to guess the movie");
        System.out.println("you  " + maxTrying + " to guess the movie");
    }

    public void guessing(char[] guessingMovie) {
        System.out.print("you are guessing: ");
        for (char character : guessingMovie) {
            System.out.print(character + " ");
        }
    }


    public char guessingLetter() {
        System.out.print("Guess a letter: ");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        return letter.charAt(0);
    }


    public void findLettersMovie(Player player, char guessLetter) {
        String auxMovie = movie;
        int position = auxMovie.indexOf(guessLetter);
        char[] guessingMovie = player.getGuessingMovie();
        boolean ban = true;
        int auxPosition = 0;
        while (position != -1) {
            guessingMovie[auxPosition + position] = auxMovie.charAt(position);
            auxMovie = auxMovie.substring(position + 1);
            auxPosition += position + 1;
            position = auxMovie.indexOf(guessLetter);
            ban = false;
        }
        if (ban) {
            player.addWrong();
            player.setWrongLetter(guessLetter);
        }
        player.setGuessingMovie(guessingMovie);
    }

    public void wrong(Player player) {
        System.out.print("you have (" + player.getWrong() + ") wrong letters: ");
        player.getWrongLetter().forEach(value -> System.out.print(value + " "));
        System.out.println("");
    }

    public boolean gameOver(Player player) {
        String guessingMovie = new String(player.getGuessingMovie());
        boolean isGameOver = false;
        if (guessingMovie.equals(movie)) {
            System.out.println("You Win");
            System.out.println("You have guessed '" + movie + "' correctly");
            isGameOver = true;
        }else {
            if (player.getWrong() >= maxTrying){
                System.out.println("You Lost");
                System.out.println("You haven't guessed '" + movie + "' correctly");
            }
        }
        return isGameOver;
    }
}
