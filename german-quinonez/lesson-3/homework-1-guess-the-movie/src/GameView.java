public class GameView {

  private Game game;

  public GameView(Game game) {
    this.game = game;
  }

  public void showWin() {
    System.out.println("You Win!");
    System.out.println(String.format("You have guessed '%s' correctly.", game.getWord()));
  }

  public void showLose() {
    System.out.println("You Lose!");
    String message = String.format("You haven't guessed '%s' correctly.", game.getWord());
    System.out.println(message);
  }

  public void showGame() {
    System.out.println(String.format("You are guessing: %s",
        game.getWordRevealed()));
    System.out.println(String.format("You have guessed (%s) wrong letters: %s",
        game.getWrongLetters().length(), String.join(" ", game.getWrongLetters().split(""))));
    System.out.print("Guess a letter:");
  }
}
