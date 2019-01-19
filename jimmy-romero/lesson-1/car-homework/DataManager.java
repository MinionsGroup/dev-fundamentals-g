import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class DataManager {
    public double loadGas() throws FileNotFoundException {
        File file = new File("D:\\Jin's folder\\minions-repository\\jimmy-romero\\lesson-1\\car-homework\\car_gasoline.txt");
        Scanner scanner = new Scanner(file);
        return Double.parseDouble(scanner.nextLine());
    }
    public double carDistance() {
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }
}
