import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class DataManager {

    public double loadGas() throws FileNotFoundException {
        File file = new File("carGasoline.txt");
        Scanner scanner = new Scanner(file);
        return Double.parseDouble(scanner.nextLine());
    }

    public double carDistance() {
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }
}
