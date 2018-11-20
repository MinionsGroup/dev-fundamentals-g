import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Add distance
        double distance = 0;
        if (args.length == 0){
            System.out.println("Please specify a distance:");
            System.exit(0);
        }
        else {
            distance = Integer.parseInt(args[0]);
            System.out.println("Distance added: "+ distance);
        }


        // Add fuel from a file .txt
        File file = new File("fuel.txt");
        Scanner scanner = new Scanner(file);
        double fuel = Integer.parseInt(scanner.nextLine());
        System.out.println("Fuel added: "+fuel);



        //Create Car Objects
        CarBehavior myCarBehavior = new CarBehavior();

        CarBehavior.Car suzuki = new CarBehavior.Car();
        suzuki.setName("Suzuki");
        suzuki.setFuelCapacity(100);
        myCarBehavior.addCar(suzuki);

        CarBehavior.Car chevrolet = new CarBehavior.Car();
        chevrolet.setName("Chevrolet");
        chevrolet.setFuelCapacity(201);
        myCarBehavior.addCar(chevrolet);

        CarBehavior.Car ford = new CarBehavior.Car();
        ford.setName("Ford");
        ford.setFuelCapacity(150);
        myCarBehavior.addCar(ford);


        //Add performance
        myCarBehavior.addPerformanceInKm();

        // Starting cars
        System.out.println("***********************************************");
        myCarBehavior.addFuel(suzuki,fuel);
        myCarBehavior.powerOn(suzuki);
        myCarBehavior.moveAutomobile(suzuki,distance);
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        myCarBehavior.addFuel(chevrolet,fuel);
        myCarBehavior.powerOn(chevrolet);
        myCarBehavior.moveAutomobile(chevrolet,distance);
        System.out.println("***********************************************");
        System.out.println("***********************************************");
        myCarBehavior.addFuel(ford,fuel);
        myCarBehavior.powerOn(ford);
        myCarBehavior.moveAutomobile(ford,distance);
        System.out.println("***********************************************");

        //Search Win
        myCarBehavior.searchWin(distance);
    }
}
