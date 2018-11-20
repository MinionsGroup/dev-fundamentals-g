import java.io.File;
import java.util.Scanner;

public class Number {
    public static double readDoubleFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double readDoubleFromFile(String fileName) {
        double number;
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            number = Double.parseDouble(line);

        } catch (Exception e) {
            number = 0;
        }
        return number;
    }
}
