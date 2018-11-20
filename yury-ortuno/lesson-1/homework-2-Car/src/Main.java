import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Yury Ortuno on 11/13/2018.
 */
public class Main {
    public static void main(String[] Args) {
        Car chevrolet = new Car("Chevrolet");
        Car nissan = new Car("Nissan");
        Car susuki = new Car("Susuki");

        // Gas Consume by kilometer
        double gasConsumeByKilometer;
        gasConsumeByKilometer = Math.random() * 0.1;
        chevrolet.setGasConsumeByKilometer(gasConsumeByKilometer);

        gasConsumeByKilometer = Math.random() * 0.1;
        nissan.setGasConsumeByKilometer(gasConsumeByKilometer);

        gasConsumeByKilometer = Math.random() * 0.1;
        susuki.setGasConsumeByKilometer(gasConsumeByKilometer);

        // Maximum capacity
        double maxCapacityGas;
        maxCapacityGas = 700;
        chevrolet.setMaxCapacityGas(maxCapacityGas);

        nissan.setMaxCapacityGas(maxCapacityGas);

        susuki.setMaxCapacityGas(maxCapacityGas);

        // Fill gas
        double fillGas;
        String path = "yury-ortuno/lesson-1/homework-2-Car/src/fuel.txt";
        try {
            File file = new File(path);
            Scanner readFile = new Scanner(file);
            chevrolet.fillGas(readFile.nextDouble());
            nissan.fillGas(readFile.nextDouble());
            susuki.fillGas(readFile.nextDouble());
        } catch (FileNotFoundException e) {
            System.out.println("Error: File was not found!!  " + System.getProperty("user.dir") + "/" + path);
        }

        // PowerOn car
        chevrolet.powerOn();
        nissan.powerOn();
        susuki.powerOn();

        // Route to the meta by kilometers
        Scanner read = new Scanner(System.in);
        System.out.println("Enter distance to the meta");
        double meta = read.nextDouble();

        // Total distance traveled by car
        double distanceTraveledChevrolet = chevrolet.totalRouteCar();
        double distanceTraveledONissan = nissan.totalRouteCar();
        double distanceTraveledSusuki = susuki.totalRouteCar();

        // show result
        chevrolet.metaGoal(distanceTraveledChevrolet, meta);
        nissan.metaGoal(distanceTraveledONissan, meta);
        susuki.metaGoal(distanceTraveledSusuki, meta);
    }
}
