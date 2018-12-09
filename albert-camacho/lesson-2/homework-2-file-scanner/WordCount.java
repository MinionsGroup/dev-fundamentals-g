import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String args []){
        try {
            File file = new File("albert-camacho/lesson_2/homework-2-file-scanner/ibm_system.txt");
            Scanner scanner = new Scanner(file);

            int words = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                words += line.split(" ").length;
            }
            System.out.println("The file contains: " + words + " words");
        }catch (FileNotFoundException e) {
            System.out.println("Error: File was not found!!");
        }
    }
}
