public class MainMovies {
  public static void main(String[] args) {
    HangManManager hangManManager = new HangManManager();
    hangManManager.changeToUnderscores(hangManManager.movieFormatted());
    System.out.println(".:: Guess the Movie Game ::.");

    while (!hangManManager.conditionToLoop1() && (hangManManager.getWrongGuesses().size() < 10)) {
      System.out.println("You play for: " + hangManManager.getMovieInUnderscores().toString().replace(",", "").replace("[", "").replace("]", ""));
      System.out.println("You guessed (" + hangManManager.getNumberOfGuesses().size() + ")" + " Wrong letters: " + hangManManager.getWrongGuesses().toString().replace(",", "").replace("[", "").replace("]", ""));
      System.out.println("Guess a letter: \n");
      hangManManager.comparator();
    }

    if (hangManManager.isMovieTitleIsComplete())
      System.out.println("YOU WIN!! - You have guessed '" + hangManManager.getMovieString() + "' correctly.");

    if (hangManManager.getWrongGuesses().size() == 10) System.out.println("GAME OVER! - You lost!!");
  }
}
