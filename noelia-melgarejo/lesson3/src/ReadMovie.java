import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ReadMovie {
    private ArrayList movies;
    private Random randomGenerator;

    /**
     * Constructor initializes arrayList movies and Random
     */
    ReadMovie() {
        movies = new ArrayList();
        randomGenerator = new Random();
    }

    /**
     * Gets a List of movies of a "*.txt" file
     * @return
     */
    public ArrayList getMovies() {

        try {
            File file = new File("doc.txt"); //Reading the movies "doc.txt"
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                movies.add(line);
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
        return movies;
    }

    /**
     * Gets a random movie
     * @return
     */
    public String getItemMovie() {
        int sizeListMovie = movies.size();
        int randomIndex = randomGenerator.nextInt(sizeListMovie);
        return (String) movies.get(randomIndex);
    }
}
