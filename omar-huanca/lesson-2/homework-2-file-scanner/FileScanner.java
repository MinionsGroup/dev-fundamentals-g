import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is to read a file
 *
 * @author Omar Limbert Huanca Sanchez
 * @version 1.0.
 */
public class FileScanner {

    private String fileName;

    /**
     * Constructor for File Scanner
     * This method is for initialize File Scanner attributes
     *
     * @param fileName, This is file name to read
     */
    public FileScanner(String fileName) {
        this.fileName = fileName;
    }

    /**
     * This method is to show results
     */
    public void showResults() {
        System.out.println("========= Reading file ' " + fileName + " ' ==========");

        long count = Arrays.stream(this.getStringWithAllWordsFromFile().split(" ")).count();
        System.out.println("========= Total Words: "+count+" ==========");
    }

    /**
     * This method is read line by line a file
     */
    private String getStringWithAllWordsFromFile() {
        String words = "";
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                words = words + fileScanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }

}
