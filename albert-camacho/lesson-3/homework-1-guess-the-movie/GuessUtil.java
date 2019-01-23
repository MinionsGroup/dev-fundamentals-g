import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessUtil {
    public static List<String> getListFromFile(String url) {
        List<String> movies = new ArrayList<>();

        try{
            File file = new File(url);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                movies.add(scanner.nextLine());
            }
        } catch(FileNotFoundException e) {
            System.out.println("Error: File was not found");
        }

        return movies;
    }

    public static String selectSubject(List<String> list) {
        Random r = new Random();
        return list.get(r.nextInt(list.size())+1);
    }
}
