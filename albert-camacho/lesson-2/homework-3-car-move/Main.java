import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main (String arg[]) {
        int numCars = 3;
        List<Car> listCars = new ArrayList<>();

        // Gas quantity with which the cars will be filled
        double gas = getGasFromFile("albert-camacho/lesson-2/homework-3-move-car/gas.txt");

        System.out.println("There are " + numCars + " cars");

        for (int i = 1 ; i <=numCars; i++) {
            // Cars will have different tank capacity and gasConsumed
            double tankCapacity = getRandomNumberInRange(50, 119.5);

            System.out.println("\nCar " + i + " has tank capacity of " + tankCapacity +" lts.");
            // How many kilometer per liter the car consumes the gas
            double gasConsume = getNumberFromConsole("Enter the performance (km/lt): ");

            Car car = new Car(tankCapacity,gasConsume);
            System.out.println("Filling the thank with " + gas + " lts.");
            car.fillTank(gas);

            listCars.add(car);
        }

        // All cars will travel the same distance
        System.out.println("\nAll cars were filled with " + gas + " lts. of fuel.");
        double distance = getNumberFromConsole("Enter the distance they will travel: ");

        System.out.println("\nStatus of all Cars if the distance is: " + distance + " Kms");
        System.out.println("-----------------------------------------------------\n");

        for (Car car : listCars) {
            car.move(distance);

            car.printStatus();
            System.out.println("-----------------------------------------------------");
        }
    }

    // Util method to get a random number between two doubles
    private static double getRandomNumberInRange(double min, double max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        double number = min + (max - min) * r.nextDouble();

        // Round the value to two digits after the comma
        double scale = Math.pow(10, 2);
        return Math.round(number * scale) / scale;
    }

    // Asks for number and repeats the message in case the input value isn't a number
    private static double getNumberFromConsole(String message) {
        double number = 0;
        boolean isDouble = false;

        while(!isDouble) {
            try {
                Scanner inputScanner = new Scanner(System.in);

                System.out.print(message);
                number = inputScanner.nextDouble();

                isDouble = true;
            } catch (InputMismatchException exception) {
                System.out.println("Error: You entered a not number value!!\n");
            }
        }
        return number;
    }

    private static double getGasFromFile(String path) {
        double gas = 0;
        try {
            File file = new File(path);
            Scanner fileScanner = new Scanner(file);
            gas = fileScanner.nextDouble();
        }catch (FileNotFoundException e) {
            System.out.println("Error: File was not found!!");
        }
        return gas;
    }
}
