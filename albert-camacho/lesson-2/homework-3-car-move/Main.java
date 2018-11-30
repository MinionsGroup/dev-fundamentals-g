import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main (String args[]) {
        int numCars = 3;
        double distance = 1500;  // distance to travel if there args is empty
        List<Car> listCars = new ArrayList<>();

        // 1. Retrieves the distance from argument if no exception is raised
        if (args.length > 0) {
            try {
                distance = Double.parseDouble(args[0]);
            } catch(NumberFormatException e){
                System.out.println("Alert: Entered value isn't a double type. Taking the default value... ");
            }
        }

        // 2. Gas quantity with which the cars will be filled
        double gas = getGasFromFile("albert-camacho/lesson-2/homework-3-car-move/gas.txt");

        System.out.println("This app tests " + numCars + " cars, please enter their performance (km/lt)...");

        // 3. Ask the performance value of all cars
        for (int i = 1 ; i <=numCars; i++) {
            // Cars will have a random gas capacity
            double gasCapacity = getRandomNumberInRange(50, 119.5);

            System.out.println("\nCar " + i + " has gas capacity of " + gasCapacity +" lts.");
            // Asks through console how many kilometer per liter the car consumes the gas
            double gasConsumption = getNumberFromConsole("Enter the performance (km/lt): ");

            Car car = new Car(gasCapacity, gasConsumption);
            System.out.println("Loading the thank with " + gas + " lts.");
            car.loadGas(gas);

            listCars.add(car);
        }

        // 4. Power-on, move the cars and print their status
        System.out.println("\nStatus of all Cars if the distance is: " + distance + " Kms");
        System.out.println("-----------------------------------------------------\n");

        for (Car car : listCars) {
            car.powerOn();
            car.move(distance);

            printStatus(car);
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

    private static void printStatus(Car car) {
        String status = car.getIsPowerOn() ? "Power On" : "Power Off";
        String fmt = "%-12s %-12s %-15s %-10s\n";

        System.out.printf(fmt,"STATUS:", status, "MILEAGE:", round(car.getMileage()) + " km");
        System.out.printf(fmt,"GAS:", round(car.getGas()) + " lts","GAS CAPACITY:", car.getGasCapacity() + " lts");
        System.out.printf(fmt,"GAS CONSUME:", car.getGasConsumption() + " Km/lt"," ", "");
    }

    // Round the value to two digits after the comma
    private static double round(double number) {
        double scale = Math.pow(10, 2);
        return Math.round(number * scale) / scale;
    }
}
