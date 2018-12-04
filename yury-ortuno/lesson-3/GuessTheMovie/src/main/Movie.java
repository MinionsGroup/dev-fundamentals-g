package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Yury Ortuno on 12/3/2018.
 */
public class Movie {
    private List<String> movies;
    private String movie;

    Movie(){
        this.movies = readMovies();
        movie = "";
    }

    private List<String> readMovies() {
        File file = new File("src/main/movies.txt");
        List<String> movies = new LinkedList<>();
        try {
            Scanner readFile = new Scanner(file);
            while(readFile.hasNextLine()){
                movies.add(readFile.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist");
        }
        return movies;
    }

    public String getRandomMovie() {
        int indexMovieSelected = (int) (Math.random() * movies.size());
        movie = movies.get(indexMovieSelected);
        return movie;
    }
}
