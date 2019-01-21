import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Util {

  public static String readWordsFromFile(String fileName) {
    StringBuilder words = new StringBuilder();
    File file = new File(fileName);
    try {
      Scanner scanner = new Scanner(file);
      String line;
      while (scanner.hasNextLine()) {
        line = scanner.nextLine();
        words.append(line);
        words.append(System.lineSeparator());

      }


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return words.toString();
  }

  public static char readChar() {
    Scanner reader = new Scanner(System.in);
    return reader.next().charAt(0);

  }
}
