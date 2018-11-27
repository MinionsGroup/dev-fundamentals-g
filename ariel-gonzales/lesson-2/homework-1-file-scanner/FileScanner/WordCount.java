package FileScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ariel-gonzales\\lesson-2\\homework-1-file-scanner\\FileScanner\\TextFile.txt");
        Scanner scanner = new Scanner(file);
        int wordsCount = 0;
        System.out.println("---------------------------------------------------------------------");
        while (scanner.hasNextLine()) {
            String text = scanner.nextLine();
            wordsCount += text.split(" ").length;
            System.out.println(text);
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println(String.format("The number of words into the text is: %d",wordsCount));
    }
}
