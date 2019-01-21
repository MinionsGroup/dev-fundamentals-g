import java.io.File;
import java.util.Scanner;

public class MainCar {
    public static void main(String args[]) {

        double distance = (args.length == 1) ? Double.parseDouble(args[0]) : Math.random() * 10010;

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setCapacity(1000);
        car2.setCapacity(1000);
        car3.setCapacity(1000);

        double gas = readDoubleFromFile("gas.txt");

        car1.loadGas(gas);
        car2.loadGas(gas);
        car3.loadGas(gas);

        System.out.println("Input a value for gas consume: ");
        car1.setGasConsume(readDoubleFromKeyboard());
        System.out.println("Input a value for gas consume: ");
        car2.setGasConsume(readDoubleFromKeyboard());
        System.out.println("Input a value for gas consume: ");
        car3.setGasConsume(readDoubleFromKeyboard());


        car1.powerOn();
        car2.powerOn();
        car3.powerOn();

        car1.move(distance);
        car2.move(distance);
        car3.move(distance);

        if (comparePerformance(car1, car2) && comparePerformance(car1, car3)) {

            System.out.println("car 1 won");

        } else if (comparePerformance(car2, car3) && comparePerformance(car2, car3)) {

            System.out.println("car 2 won");

        } else {

            System.out.println("car 3 won");

        }
    }

    public static boolean comparePerformance(Car car, Car otherCar) {
        return (car.getDistance() > otherCar.getDistance()) ? true :
                (car.getGas() > otherCar.getGas()) ? true :
                        (car.getGasConsume() > otherCar.getGasConsume()) ? true : false;
    }

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
