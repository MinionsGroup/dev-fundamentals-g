import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordCount {
    public static void main(String args[]) throws FileNotFoundException {
        String path = String.format("%s%s", System.getProperty("user.dir"),
                "\\escarleth-ledezma\\lesson-2\\homework-2-file-scanner\\Polymorphism.txt");
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println(String.format("The file contains %s words", words));
    }
}
