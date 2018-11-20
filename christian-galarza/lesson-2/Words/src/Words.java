import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Words {
    public static void main(String args[]) throws FileNotFoundException {
        String path = "read/words.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println(String.format("The file selected contains %s words", words));
    }
}
