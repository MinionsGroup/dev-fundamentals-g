import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadValues {
    int carId = 1;

    public double readGas() throws FileNotFoundException {
        File file = new File("ariel-gonzales\\lesson-2\\homework-2-car-inputs\\car-app\\gas.txt");
        Scanner scanner = new Scanner(file);
        return scanner.nextDouble();
    }

    public double readScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("Set the gasConsume for the %d car", carId++));
        return sc.nextDouble();
    }
}
