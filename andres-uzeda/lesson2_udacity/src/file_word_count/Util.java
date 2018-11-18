package file_word_count;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Util {
    public static int NumberOfWordInAFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        int words = 0;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        return words;
    }
}
