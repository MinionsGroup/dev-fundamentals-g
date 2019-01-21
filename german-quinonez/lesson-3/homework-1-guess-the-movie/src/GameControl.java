public class GameControl {

  private Game game;
  private GameView gameView;

  public GameControl(Game game, GameView gameView) {
    this.game = game;
    this.gameView = gameView;
  }

  public void start() {
    while (!game.finished()) {
      gameView.showGame();
      game.insertChar(Util.readChar());

    }
    if (game.isRevealed()) {
      gameView.showWin();
    } else {
      gameView.showLose();
    }
  }


}
