public class Main {
    public static void main(String[] args) {
        GuessMovie movie = new GuessMovie();
        while (!movie.toLose()) {
            movie.startGame();
        }
        movie.toWonGame();
    }
}
