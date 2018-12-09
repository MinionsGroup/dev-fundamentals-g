package lesson_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Daniel Cabero
 *
 * @since 18/11/2018.
 */
public class WordCount {
    public static void main(String[] args) {
        File file = new File(System.getProperty("user.dir") + "/daniel-cabero/" + "Exampletext.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Missing file");
            try {
                throw e;
            } catch (FileNotFoundException exe) {
                exe.printStackTrace();
            }
        }
        int words = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }

        System.out.println("The file contains " + words + " words");


    }
}