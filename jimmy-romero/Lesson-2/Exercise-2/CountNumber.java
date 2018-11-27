import java.util.Scanner;
import java.io.File;
public class CountNumber {
    public static void main (String[] args) throws Exception {

        File file = new File("D:\\Jin's folder\\minions-repository\\jimmy-romero\\Lesson-2\\Exercise-2\\java.txt");
        Scanner scanner = new Scanner(file);
        int numberOfWords = 0;
        while (scanner.hasNextLine()) {
            numberOfWords += scanner.nextLine().split(" ").length;
        }
        System.out.println("Number of words: " + numberOfWords);
    }
}
