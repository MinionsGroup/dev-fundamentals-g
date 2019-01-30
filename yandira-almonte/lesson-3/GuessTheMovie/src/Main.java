import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Movies movies = new Movies();
		Player player = new Player();

		player.setMovieToGuess(movies.getMovie());
		player.setEncodedMovie(movies.getEncodeMovie());

		Scanner scanner = new Scanner(System.in);

		while (player.canPlay()) {
			System.out.println("You are guessing: " + player.getMovie(true));
			System.out.println("You have guessed (" +player.getFails()+") wrong letters: "+player.getWrongLetters());
			System.out.println("Guess a letter: ");
			char input='\u0000';
			try{
			input=scanner.nextLine().toLowerCase().charAt(0);
			}catch (Exception e){
				System.out.println("Enter a letter.");
			}
			
			if(input!='\u0000'){
				String guessLetter = String.valueOf(input);
				String movie=player.getMovie(false);
				if (movie.toLowerCase().contains(guessLetter)) {
					String encodeMovie=movies.getEncodeMovie(player.getMovie(true), guessLetter);
					player.setEncodedMovie(encodeMovie);
					
				} else {
					player.fail(guessLetter);
				}
				if(movie.compareToIgnoreCase(player.getMovie(true))==0){
					System.out.println("You win!!!!");
					player.setMovieToGuess(movies.getMovie());
					player.setEncodedMovie(movies.getEncodeMovie());
				}
			}


		}
		System.out.println("You lose! Nice try");

	}
}
