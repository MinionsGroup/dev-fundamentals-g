public class Main {

    public static void main(String[] args) {
        GuessTheMovie GuessTheMovie = new GuessTheMovie();
        while (!GuessTheMovie.isGameOver()) {
            GuessTheMovie.playGame();
        }
        GuessTheMovie.checkScore();
    }
}