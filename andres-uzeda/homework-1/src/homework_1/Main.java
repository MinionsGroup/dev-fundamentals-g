package homework_1;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        double aDistance;
        double kilometersGas;
        ArrayList<Double> arrayGasList = Util.readCarsGas();
        System.out.println("insert kilometers/gas for the cars");
        kilometersGas = scanner.nextDouble();
        Car firstCar = new Car(kilometersGas);
        Car secondCar = new Car(kilometersGas);
        Car thirdCar = new Car(kilometersGas);
        System.out.println("insert a distance that cars will move");
        aDistance = scanner.nextDouble();
        firstCar.fillUpGas(arrayGasList.get(0));
        secondCar.fillUpGas(arrayGasList.get(1));
        thirdCar.fillUpGas(arrayGasList.get(2));
        firstCar.powerOn();
        secondCar.powerOn();
        thirdCar.powerOn();
        System.out.println("Cars will start to move");
        firstCar.move(aDistance);
        secondCar.move(aDistance);
        thirdCar.move(aDistance);
        System.out.println("Cars was moved");
    }
}
