package movies;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Movie movie = new Movie();

        String movieName = movie.getRandomMovieName();
        String movieNameOfi = movieName;

        System.out.println("The game start: \n");
        System.out.print(movie.replaceMovieName(movieName));

        char [] hideMovieName = movie.replaceMovieName(movieName).toCharArray();
        String movieActualName = "";
        boolean verification;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nEnter a letter: ");
            char letter = Character.toLowerCase(scanner.next().charAt(0));
            verification = false;
            for (int i = 0; i < movieName.length(); i++) {
                if (movieName.charAt(i) == letter) {
                    hideMovieName[i] = letter;
                    System.out.println(String.valueOf(hideMovieName));

                    char[] nameChars = movieName.toCharArray();
                    nameChars[i] = '_';
                    movieName = String.valueOf(nameChars);

                    movieActualName = String.valueOf(hideMovieName);

                    verification = true;
                    break;
                }
            }
            if (!verification) {
                System.out.println("Letter not in movie name");
                movie.subtractTrying();
                System.out.println("Tryings: " + movie.getTrying());
            }
            if (movieActualName.equals(movieNameOfi)) {
                movie.setTrying(-1);
            }
        } while (movie.getTrying() > 0);

        if (movie.getTrying() == 0) {
            System.out.println("You lost the game");
        } else {
            System.out.println("You win game");
        }
    }
}
