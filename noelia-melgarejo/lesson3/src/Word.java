import java.util.ArrayList;

public class Word {
    private ArrayList<String> movieWord;
    private String randomMovie;
    private ArrayList<String> saveWrongLetter;

    /**
     * Constructor initializes arrayList movieWord and saveWrongLetter
     * @param randomMovie is the movie for guessing
     */
    public Word(String randomMovie) {
        movieWord = new ArrayList<String>();
        saveWrongLetter = new ArrayList<String>();
        this.randomMovie = randomMovie;
    }

    /**
     * Gets the word to guess with underscore
     * @return
     */
    public String displayUnderscores() {
        for (int i = 0; i < randomMovie.length(); i++) {
            char space = ' ';
            if (randomMovie.charAt(i) == space)
                movieWord.add(" ");
            else
                movieWord.add("_");
        }
        return String.join("", movieWord);
    }

    /**
     * Gets the word with letters guessed
     * @param letter the letter entered
     * @return
     */
    public String searchLetter(char letter) {
        boolean found = false;
        for (int i = 0; i < randomMovie.length(); i++) {
            if (randomMovie.charAt(i) == letter) {
                movieWord.set(i, Character.toString(letter));
                found = true;
            }
            if (i == randomMovie.length() - 1 && found == false)
                saveWrongLetter.add(Character.toString(letter));
        }
        return String.join("", movieWord);
    }

    /**
     * Gets the wrong letters entered
     * @return
     */
    public String getWrongCharEntered() {
        return String.join("", saveWrongLetter);
    }

    /**
     * Gets amount of wrong letters entered
     * @return
     */
    public int getNumberOfWrongLetters() {
        return saveWrongLetter.size();
    }

}
