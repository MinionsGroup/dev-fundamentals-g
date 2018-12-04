import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class GuessMovieGame {
    private List<String> moviesTitleList;
    private String chosenMovie;
    private String hiddenChosenMovie;
    private int lostPoints;


    public GuessMovieGame(List<String> moviesTitleList) {
        this.moviesTitleList = moviesTitleList;
        chosenMovie = "";
        hiddenChosenMovie = "";
        lostPoints = 0;
    }

    private String getRandomMovie() {
        int randomPosition = (int) (Math.random() * moviesTitleList.size() - 1) + 1;
        return moviesTitleList.get(randomPosition);
    }

    private String convertMovieNameToUnderscores(String guessMovie) {
        return guessMovie.replaceAll("[a-z0-9]", "_");
    }

    public void playGuessGame() {
        chosenMovie = getRandomMovie();
        hiddenChosenMovie = convertMovieNameToUnderscores(chosenMovie);
        StringJoiner wrongLetters = new StringJoiner(" ");
        Scanner scanner = new Scanner(System.in);
        boolean won = false;
        showPartialResults(wrongLetters.toString());
        while (lostPoints < 10) {
            String letter = scanner.nextLine();
            if (verifyIfLetterExist(letter)) {
                hiddenChosenMovie = updateMovieHidden(letter.charAt(0));
                showPartialResults(wrongLetters.toString());
                if (hiddenChosenMovie.equals(chosenMovie)) {
                    System.out.println("Congratulations,You WIN!!!");
                    System.out.println(String.format("You have guessed %s correctly", chosenMovie));
                    won = true;
                    break;
                }
            } else {
                lostPoints++;
                wrongLetters.add(letter);
                showPartialResults(wrongLetters.toString());
            }
        }
        if (!won) {
            System.out.println("Sorry,You LOSE =(");
            System.out.println(String.format("The guessed movie was: %s", chosenMovie));
        }
    }

    private boolean verifyIfLetterExist(String letter) {
        return chosenMovie.contains(letter);

    }

    private String updateMovieHidden(char letter) {
        StringBuilder hiddenMovieUpdated = new StringBuilder();
        for (int i = 0; i < chosenMovie.length(); i++) {
            hiddenMovieUpdated.append(chosenMovie.charAt(i) == letter ? letter : hiddenChosenMovie.charAt(i));
        }
        return hiddenMovieUpdated.toString();
    }

    private void showPartialResults(String wrongLetters) {
        System.out.println(String.format("\nYou are guessing: %s", hiddenChosenMovie));
        System.out.println(String.format("You have guessed (%d) wrong letters: %s", lostPoints, wrongLetters));
        System.out.println("Guess a letter: ");
    }
}
