import java.io.File;
import java.util.Scanner;

public class ReadFile {
    public double readGas() {
        File file = new File("gasoline.txt");
        Scanner scanner = new Scanner(file);
        return Double.parseDouble(gas.nextLine());
    }

    public double readDistance() {
        System.out.println("Insert car's distance: ");
        Scanner distance = new Scanner(System.in);
        return Double.parseDouble(distance.nextLine());
    }
}