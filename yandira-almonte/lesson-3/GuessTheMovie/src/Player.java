import java.util.ArrayList;
import java.util.List;

public class Player {
private int fails;
private int maxFails;
private String wrongLetters;
private String instruccions;
private boolean canPlay;
private String movie;
private String encodeMovie;


public Player(){
	wrongLetters=new String();
	fails=0;
	maxFails=10;
	instruccions ="Welcome Player! You have "+maxFails+" tries. Good Luck!";
	canPlay=true;
}

public Player(int maxFails){
	wrongLetters=new String();
	fails=0;
	this.maxFails=maxFails;
	instruccions ="Welcome Player! You have "+maxFails+" tries. Good Luck!";
	canPlay=true;
}

public int getFails(){
	return fails;
}

public void fail(String value){
	fails++;
	wrongLetters+=" "+value;
	if(fails>=maxFails){
		canPlay=false;
	}
	else{
		canPlay=true;
		
	}
		
}

public String getInstructions(){
	return instruccions;
}

public boolean canPlay(){
	return this.canPlay;
}

public void setMovieToGuess(String movie){
	this.movie=movie;
}

public String getMovie(boolean encoded){
	if(encoded)
		return encodeMovie;
	else
		return movie;
}

public void setEncodedMovie(String movie){
	this.encodeMovie=movie;
}

public String getWrongLetters(){
	return wrongLetters;
}
}
