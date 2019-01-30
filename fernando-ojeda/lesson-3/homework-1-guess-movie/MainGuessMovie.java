package com.company;

import java.util.List;
import java.util.Scanner;

public class MainGuessMovie {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        GuessMovie guessMovie = new GuessMovie();
        String movie = guessMovie.getMovie();
        System.out.println(movie);
        guessMovie.addCharData(movie);
        int points = 0;
        while (points <= 10) {
            System.out.println("You are guessing:");
            guessMovie.showGuestMovie();
            if (guessMovie.verifyWinGame(guessMovie.repleceMovie(movie))) break;
            System.out.println("\nYou have guessed (" + points + ") wrong letters:");
            System.out.println("Guest a letter:");
            char character = scanner.next().charAt(0);
            points = getPoints(guessMovie, points,character);
        }
        if (points == 11) {
            System.out.println("You lost the game");
        }
    }

    private static int getPoints(GuessMovie guessMovie, int points, char character) {
        int numValue = 0;
        numValue = containsCharacter(guessMovie.getMovieCharacters(), guessMovie.getGuessSymbols(), numValue,
                character);
        if (numValue == 0) {
            points++;
        }
        return points;
    }

    private static int containsCharacter(List<Character> characters, List<Character> symbol, int numValue,
                                         char character) {
        for (int count = 0; count < characters.size(); count++) {
            if (character == characters.get(count)) {
                symbol.set(count, characters.get(count));
                numValue++;
            }
        }
        return numValue;
    }
}
