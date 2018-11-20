import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String [] args) throws Exception{
        File file = new File("FallingInWithFortune.txt");
        //Use the File Scanner to read the contents od any large file.
        Scanner scanner = new Scanner(file);

        int words = 0;
        //Create a loop that reads every line into a string.
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            //Split the string using the space character as a delimiter.
            int delimiter = line.split(" ").length;
            //Count the number of words in that line using the length of the split array.
            //Add up all the words in every line read from the file
            words += delimiter;
        }
        //Display the total word count.
        System.out.println("The file contains: " + words + " words");
    }
}
