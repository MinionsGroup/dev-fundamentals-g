package movies;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Movie movie = new Movie();

        String movieName = movie.getRandomMovieName();
        movieName = movieName.toLowerCase();
        System.out.println(movieName);

        System.out.print(movie.replaceMovieName(movieName));

        char [] hideMovieName = new char[movie.replaceMovieName(movieName).length()];

        Scanner scanner = new Scanner(System.in);

        while (movie.getTrying() >= 0) {
            System.out.println("Enter a letter: ");

            char letter = Character.toLowerCase(scanner.next().charAt(0));

            for (int index = 0; index < movieName.length(); index++) {
                if (movieName.charAt(index) == letter) {
                    hideMovieName[index] = letter;
                    System.out.println(hideMovieName);
                    break;
                }
            }

            movie.subtractTrying();
        }
    }
}
