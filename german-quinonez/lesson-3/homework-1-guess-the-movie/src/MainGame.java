public class MainGame {

  public static void main(String[] args) {
    Game game = new Game();
    GameView gameView = new GameView(game);
    GameControl gameControl = new GameControl(game, gameView);
    gameControl.start();

  }
}
