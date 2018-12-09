package guess_the_movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static char[] aMovieInAfile(String path) throws FileNotFoundException {
        ArrayList<String> listOfMovies = new ArrayList<>();
        File file = new File(path);
        int sizeOfListOfMovies;
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            listOfMovies.add(line);
        }
        sizeOfListOfMovies = listOfMovies.size();
        char[] movieTitleInCharArray = listOfMovies.get(getRandomNumberInRange(0,sizeOfListOfMovies)).toCharArray();
        return movieTitleInCharArray;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    static public boolean playAgain(Scanner keyboard) {
        char playAgain;
        System.out.println("Play again? y/n");
        playAgain = keyboard.nextLine().charAt(0);
        while (playAgain != 'y' && playAgain != 'n') {
            System.out.println("Please use 'y' for yes or 'n' for no.");
            System.out.println("Play again? (y/n)");
            playAgain = keyboard.nextLine().charAt(0);
        }
        if (playAgain == 'n') {
            System.out.println("Thanks for playing!!!");
            return true;
        } else {
            System.out.println("Let's play again!");
            return false;
        }
    }
}
