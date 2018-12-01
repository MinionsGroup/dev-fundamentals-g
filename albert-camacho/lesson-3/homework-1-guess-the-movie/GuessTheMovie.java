import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GuessTheMovie {

    public static void main(String [] args) {
        String url = "albert-camacho/lesson-3/homework-1-guess-the-movie/movies.txt";
        int points = 10;

        // replace url and point if they are in the arguments
        if(args.length > 0) {
            url = args[0];
            points = Integer.parseInt(args[1]);
        }

        // Retrieve list of movies from file
        List<String> movies = GuessUtil.getListFromFile(url);

        // Create the game
        Game game = new Game(new GuessSubject(movies));
        boolean nextGame = true;

        // Play the game until user says anything different than 'y'
        while (nextGame) {
            game.play(points);

            Scanner read = new Scanner(System.in);
            System.out.println("\nDo you want to continue with a new game? (y/n): ");
            String newGame = read.next().toLowerCase();

            // Load new movie title is yes
            if (newGame.equals("y")) {
                game.newGame();
            } else {
                nextGame = false;
            }
        }
    }

    private static class Game {
        private GuessSubject subject;
        private int lostPoints;
        private Game(GuessSubject subject){
            this.subject = subject;
            this.lostPoints = 0;
        }

        private void play(int points){
            while (lostPoints <= points) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("\nYou are guessing: " + subject.getGuessedSubject());
                    System.out.println("You have guessed (" + lostPoints + ") wrong letters.");
                    System.out.println("GuessSubject a letter: ");
                    char letter = scanner.next(".").charAt(0);
                    if (winner(letter)) {
                        System.out.println("\nYou win!");
                        System.out.println("You have guessed '" + subject.getGuessedSubject() + "' correctly.");
                        break;
                    }
                }catch (InputMismatchException e) {
                    System.out.println("Warning: please enter just one letter next time");
                }
            }
            if (lostPoints > points) {
                System.out.println("\nGame Over, You lose!!");
                System.out.println("The movie name was: " + subject.getSubject());
            }
        }

        private void newGame() {
            subject.load();
            lostPoints = 0;
        }

        private boolean winner(char letter) {
            if (subject.contains(letter)){
                if (subject.guessCompleted()) {
                    return true;
                }
            } else{
                lostPoints ++;
            }
            return false;
        }
    }
}
