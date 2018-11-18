import java.util.Random;

public class Main {
    public static void main (String arg[]) {
        int numCars = 3;

        // All cars will travel the same distance
        double distance = getRandomNumberInRange(1500, 3000);
        System.out.println("Status of all Cars if the distance is: " + distance + " Kms");
        System.out.println("-----------------------------------------------------\n");

        for (int i = 1; i <= numCars; i++) {
            double tankCapacity = getRandomNumberInRange(50, 119.5);
            double gasConsume = getRandomNumberInRange(21.5, 32.1);

            Car car = new Car(tankCapacity,gasConsume);
            car.fillTank(tankCapacity);
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
}
