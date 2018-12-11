import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException {

        Car car1 = new Car(120.0, addCarPerformance());
        Car car2 = new Car(100.0, addCarPerformance());
        Car car3 = new Car(130.0, addCarPerformance());
        double combustible = addCombustible();
        car1.fillGas(combustible);
        car2.fillGas(combustible);
        car3.fillGas(combustible);
        car1.powerOn();
        car2.powerOn();
        car3.powerOn();
        double distance = addDistance();
        car1.move(distance);
        car2.move(distance);
        car3.move(distance);
        System.out.println(String.format("The car 1 combustible after movement is: %s", car1.getGas()));
        System.out.println(String.format("The car 2 combustible after movement is: %s", car2.getGas()));
        System.out.println(String.format("The car 3 combustible after movement is: %s", car3.getGas()));
        System.out.println(String.format("The car 1 mileage after movement is: %s", car1.getMileage()));
        System.out.println(String.format("The car 2 mileage after movement is: %s", car2.getMileage()));
        System.out.println(String.format("The car 3 mileage after movement is: %s", car3.getMileage()));
        car1.powerOff();
        car2.powerOff();
        car3.powerOff();
    }

    private static double addCarPerformance() {
        System.out.println("Please,Insert the Car Performance");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static double addCombustible() throws FileNotFoundException {
        String path = String.format("%s%s", System.getProperty("user.dir"),
                "\\escarleth-ledezma\\lesson-2\\homework-3-car-updated\\combustible.txt");
        File file = new File(path);
        Scanner fileScanner = new Scanner(file);
        return fileScanner.nextDouble();
    }

    private static double addDistance() {
        System.out.println("Please,Insert the distance: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
