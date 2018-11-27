
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int idCar = 0;

    public static void main(String[] args) throws FileNotFoundException {

        double distance = setDistance(args);

        //To run from cmd use the following path ""%s\\ariel-gonzales\\lesson-2\\homework-2-car-inputs\\gas.txt"" as "Java Main 36" <--(distance)
        File file = new File(String.format("%s\\ariel-gonzales\\lesson-2\\homework-2-car-inputs\\car-app\\gas.txt", System.getProperty("user.dir")));
        Scanner scanner = new Scanner(file);
        double gas = Double.parseDouble(scanner.nextLine());

        List<Car> garage = new ArrayList<>();


        Car suzuki = new Car(26, setGasConsume());
        suzuki.powerOn();
        suzuki.loadGas(gas);


        Car ford = new Car(40, setGasConsume());
        ford.powerOn();
        ford.loadGas(gas);


        Car honda = new Car(30, setGasConsume());
        honda.powerOn();
        honda.loadGas(gas);


        garage.add(suzuki);
        garage.add(ford);
        garage.add(honda);

        System.out.println("There are the stadistics of the cars: ");
        for (Car c : garage) {
            c.move(distance);
            System.out.println(String.format("The max distance of the car is %fKm after to drive %fKm, it has on the tank %fL of gas", c.getMileage(), distance, c.getGas()));
        }

    }

    public static double setGasConsume() {
        System.out.println(String.format("Insert the gasConsume of the car %d: ", ++idCar));
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    public static double setDistance(String[] args) {
        System.out.println("Please specify a distance different by 15 (default): ");
        return (args.length == 0) ? 15 : Double.parseDouble(args[0]);
    }
}


