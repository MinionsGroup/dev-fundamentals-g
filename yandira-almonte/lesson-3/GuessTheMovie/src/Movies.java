import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Movies {
	private String path;
	private List<String> movies;
	private int index;

	public Movies(String path) {
		this.path = path;
		readMovies();
		index=0;
	}

	public Movies(){
		this.path="movies.txt";
		readMovies();
		index=0;
	}

	private void readMovies() {
		movies = new ArrayList<String>();
		File file = new File(this.path);
		Scanner scanner;
		
		try {
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine()){
				movies.add(scanner.nextLine());	
			}
		} catch (FileNotFoundException e) {
			System.out.println("The file doesn't exist");
		} 
	}

	public List<String> getMovies() {
		return movies;
	}
	
	public String getMovie(){
		Random rand = new Random();
		index = rand.nextInt(movies.size()) ;
		return movies.get(index);
	}
	
	public String getEncodeMovie(){
		String response= getEncodeMovie(movies.get(index),null," ");
		return response;
	}
	
	public String getEncodeMovie(String encode, String value){
		String response= getEncodeMovie(movies.get(index),encode,value);
		return response;
	}
	
	
	
	private static String getEncodeMovie(String original, String encode, String value){
		String response=new String();
		for(int ix=0;ix<original.length();ix++){
			String val=original.charAt(ix)+"";
			if(val.compareToIgnoreCase(value)==0){
				response+=value;
			}
			else{
				if(encode ==null)
					response+="_";
				else
					response+=encode.charAt(ix);
			}
				
		}
		return response;
	}
	
	
}
