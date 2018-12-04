package movies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {

    private List<String> moviesList;
    private String randomMovieName;
    private int trying;
    Movie() {
       // this.moviesList = getMovieList();
        this.randomMovieName = getRandomMovieFromList();
        this.trying = 3;
    }

    public void subtractTrying() {
        this.trying -=1;
    }

    public int getTrying() {
        return this.trying;
    }

    public String getRandomMovieName() {
        return randomMovieName;
    }

    public List<String> getMoviesList() {
        return moviesList;
    }

    private String getRandomMovieFromList() {
        List<String> moviesList = getMovieList();
        int sizeList = moviesList.size();
        int randomIndex = (int) (Math.random() * sizeList);
        return moviesList.get(randomIndex);
    }


    private List<String> getMovieList() {
        File moviesFile = new File("movieList.txt");
        List<String> moviesList = new ArrayList<String>();
        try {
            Scanner read = new Scanner(moviesFile);
            while (read.hasNextLine()) {
                moviesList.add(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return moviesList;
    }

    public String replaceMovieName(String movieName) {
        movieName = movieName.replaceAll("[a-z]", "_");
        return movieName;
    }
}
