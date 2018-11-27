import java.io.File;
import java.util.Scanner;
public class WordsCounter {
    public static void main(String[] args) throws Exception{
        File file = new File("book.txt");
        Scanner scanner = new Scanner(file);
        int numberWords = 0;
        while (scanner.hasNextLine()){
            numberWords += scanner.nextLine().split(" ").length;
        }
        System.out.println(numberWords);
    }
}
