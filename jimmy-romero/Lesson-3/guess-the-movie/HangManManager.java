import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangManManager {

  public static final char BLANK_SPACE = ' ';
  public static final char UNDERSCORE = '_';
  private String mMovieString;
  private MovieManager mMovieManager = new MovieManager();
  private List<Character> mMovieLettersInCharacterList = new ArrayList<>();
  private List<Character> movieChangedToUnderscores = new ArrayList<>();
  private List<Character> mAccumulatorOfGuesses = new ArrayList<>();
  private List<Character> mWrongGuesses = new ArrayList<>();
  private boolean mMovieTitleIsComplete = false;

  public boolean isMovieTitleIsComplete() {
    return mMovieTitleIsComplete;
  }

  public void changeToUnderscores(List<Character> movieChangedToUnderscores) {
    this.movieChangedToUnderscores = movieChangedToUnderscores;
  }

  public List<Character> getMovieInUnderscores() {
    return movieChangedToUnderscores;
  }

  public String getMovieString() {
    return mMovieString;
  }

  public List<Character> getNumberOfGuesses() {
    return mAccumulatorOfGuesses;
  }

  public List<Character> getWrongGuesses() {
    return mWrongGuesses;
  }

  private List<Character> lettersOfMovieIntoArrayList() {
    mMovieString = mMovieManager.randomlyPickMovie();
    char[] letter = mMovieString.toCharArray();
    for (char aLetter : letter) {
      mMovieLettersInCharacterList.add(aLetter);
    }
    return mMovieLettersInCharacterList;
  }

  public List<Character> movieFormatted() {
    mMovieLettersInCharacterList = lettersOfMovieIntoArrayList();
    for (int iterator = 0; iterator < mMovieLettersInCharacterList.size(); iterator++) {
      Character character = mMovieLettersInCharacterList.get(iterator);
      if (character == BLANK_SPACE) {
        movieChangedToUnderscores.add(BLANK_SPACE);
      } else {
        movieChangedToUnderscores.add(UNDERSCORE);
      }
    }
    return movieChangedToUnderscores;
  }

  private char singleGuess() {
    Scanner input = new Scanner(System.in);
    String guessString = input.next();
    return guessString.toLowerCase().charAt(0);
  }

  public List<Character> comparator() {
    char guessChar = singleGuess();
    boolean checker = false;
    for (int iterator = 0; iterator < mMovieLettersInCharacterList.size(); iterator++) {
      if (mMovieLettersInCharacterList.get(iterator) == guessChar) {
        movieChangedToUnderscores.remove(iterator);
        movieChangedToUnderscores.add(iterator, guessChar);
        checker = true;
      }
    }
    if (!checker) {
      mWrongGuesses.add(guessChar);
    }
    if (checker && !mAccumulatorOfGuesses.contains(guessChar)) {
      mAccumulatorOfGuesses.add(guessChar);
    }
    return movieChangedToUnderscores;
  }

  public boolean conditionToLoop1() {
    for (int iterator = 0; iterator < mMovieLettersInCharacterList.size(); iterator++) {
      if (mMovieLettersInCharacterList.get(iterator) != movieChangedToUnderscores.get(iterator)) {
        return false;
      }
    }
    mMovieTitleIsComplete = true;
    return true;
  }
}
