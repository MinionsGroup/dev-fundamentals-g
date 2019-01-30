package guessthemovie;
import java.util.Scanner;

public class MainGuessTheMovie {
	
	public static void main(String[] args) {
		GuessTheMovie movie = new GuessTheMovie();
		String name = movie.getMovieName(); 
		String charMovie;
		int attemps = 10;
		
		System.out.println("***************************** Guess Movie name ************************");
		System.out.println(":" + movie.displaysUnderscoreMovieName());
		System.out.println("***************************** You have 10 attemps ************************");
		while(attemps != 0) {
			System.out.println("Enter char to guess the movie name: ");
			Scanner scanner = new Scanner(System.in);
			charMovie = scanner.nextLine();
			if (movie.charBelongsToMovie(charMovie.charAt(0))) {
				System.out.println(charMovie +" belongs to the movie");
			}			
			attemps --;
		}
		if(attemps == 0) {
			System.out.println("Movie name is: " + name);
		}
	}
}
