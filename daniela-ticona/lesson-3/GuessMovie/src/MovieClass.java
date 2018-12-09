import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class MovieClass {

    private ArrayList<String> films;
    private Scanner scanner;
    private String randomFilm;
    private String guessString;
    private int NUM_GUESSES = 11;
    private static char userInput;
    private StringBuilder result;
    private ArrayList<Character> letterArray = new ArrayList<>();

    /* lee el fichero*/
    MovieClass() throws Exception {
        try {
            File file = new File("movies.txt");
            scanner = new Scanner(file);
            films = new ArrayList<>();
            while (scanner.hasNextLine()) {
                films.add(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            System.out.println("ERROR!");
        }
        int randomIndex = (int) (Math.random() * films.size());
        randomFilm = films.get(randomIndex).toLowerCase();

        guessString = randomFilm.replaceAll("[a-zA-Z]", "_").trim();
        System.out.println(randomFilm);
        System.out.println("You are guessing: "+guessString);

        FindMatch();
    }
    /*busca si  tiene el caracter y muestra*/
    private void FindMatch() {
        while (!HasWon(guessString) && NUM_GUESSES > 1) {
            NUM_GUESSES--;
            System.out.println("You have " + NUM_GUESSES + " guesses left: ");
            System.out.print("Guess a letter:  ");
            scanner = new Scanner(System.in);
            userInput = scanner.next().toLowerCase().charAt(0);

            //check if user input is a digit or not
            if (userInput >= '0' && userInput <= '9') {
                System.out.println("This is not a letter");
            }

            if (HasTheChar(userInput)) {
                result = new StringBuilder(guessString);


                if (letterArray.contains(userInput)) {
                    System.out.println("You already guessed this letter");
                } else {

                    letterArray.add(userInput);
                }

                for (int j = 0; j < randomFilm.length(); j++) {


                    if (randomFilm.charAt(j) == userInput) {


                        result.setCharAt(j, userInput);
                        guessString = result.toString();
                    }
                }

                if (HasWon(guessString))

                    System.out.println("You win! ... You have guessed * "  + randomFilm + " * correctly :D !");
                else if (NUM_GUESSES == 1)
                    System.out.println("You loose, " + "the movie was: " + randomFilm);
                else
                    System.out.println("You are guessing: " + guessString);

            } else {
                System.out.println("Wrong letter : " + userInput);
            }
        }
    }

    /* busca el caracter */
    private boolean HasTheChar(char userInput) {
        return randomFilm.indexOf(userInput) > -1;
    }

    /*compara la cadena */
    private boolean HasWon(String guessingString) {
        return !guessingString.contains("_");
    }

}
