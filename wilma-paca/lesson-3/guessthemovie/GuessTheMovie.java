package guessthemovie;

public class GuessTheMovie {
	Movie [] movieList;
	String[] listMovie = {"Infinity War","Aquaman","A Star Wars Story","The Crimes of Grindelwald","Black Panther","Fifty Shades Freed","Spider-Man","Jurassic World","Ant-Man"," Hotel Transylvania 3","Sherlock Gnomes","Bumblebee","The Grinch","Maze Runner","Tomb Raider","Mary Poppins Returns","Incredibles 2"};
	String movieName;
	int [] indexChar;
	char [] charMovie;
	int underscoreNumber = 4;
	char underscore = '_';
	
	GuessTheMovie(){
		movieChoose();
		
	}
	
	public void addMovie() {		
		for(int i = 0 ; i <listMovie.length ;i++) {
			Movie movie = new Movie();
			movie.name=listMovie[i];
		}		
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void movieChoose() {		
		int numberRandom = (int)(Math.random()*(listMovie.length -1));
		movieName = listMovie[numberRandom];
	}
	
	public char [] changeSomeCharacterToUnderScore() {
		char [] copyMovieName = convertStringToArray(movieName);
		int indexRandom;
		//some letter are changed to underscore 
		for(int i= 0; i < underscoreNumber; i++) {
			indexRandom = (int)(Math.random()*(movieName.length() -1));
			changeCharOfMovie(indexRandom,copyMovieName);
		}
		
		return copyMovieName;
	}
	
	private char[] convertStringToArray(String movie) {
		char [] copyMovieName = {};
		for(int i = 0; i< movie.length() ; i++) {
			copyMovieName[i] = movie.charAt(i);
		}
		
		return copyMovieName;
	}
	
	private void changeCharOfMovie(int index, char [] movie) {
		int indexC = 0;
		for(int i = 0; i< movieName.length() ; i++) {
			if(i == index) {
				charMovie[indexC] = movie[i];
				movie[i] = underscore;
				
				if(indexC < underscoreNumber) {
					indexChar[indexC] = i;
					indexC ++;
				}
			}
		}
	}
	
	public String displaysUnderscoreMovieName() {		
		String movieDisplay = new String(changeSomeCharacterToUnderScore());		
		return movieDisplay;
	}
	
	public boolean charBelongsToMovie(char charCustomer) {
		boolean charExist = false;
		for(int i : charMovie) {
			if(charCustomer == i) {
				charExist = true;
			}
		}
		return charExist;
		
	}
	
}
