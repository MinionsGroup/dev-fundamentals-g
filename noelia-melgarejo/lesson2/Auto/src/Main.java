import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double gasAmount = 0;
        double distance = 0;
        Auto highPerformance = null;
        Auto mediumPerformance = null;
        Auto lowPerformance = null;
        //* Creating 3 cars with different features
        distance = Double.parseDouble(args[0]); //Read distance args[0]

        System.out.println("Enter the performance 100,50,25:");
        Scanner scanner = new Scanner(System.in); // Reading performance with Scanner
        int performance;
        try {
            File file = new File("doc.txt"); //Reading Gas amount "doc.txt"
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String readGas = fileScanner.nextLine();
                gasAmount = Double.parseDouble(readGas);
                System.out.println("gasAmount" + gasAmount);
            }

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("--------Enter performance of car  : " + (i + 1) + " and press enter" + "\n");
            performance = scanner.nextInt(); // Reading performance
            highPerformance = new Auto(performance);
            mediumPerformance = new Auto(performance);
            lowPerformance = new Auto(performance);
        }


        highPerformance.setGasCapacity(10000);
        highPerformance.powerOn();
        highPerformance.loadGas(gasAmount);
        highPerformance.move(distance);
        System.out.println("----------------------------------");


        mediumPerformance.setGasCapacity(5000);
        mediumPerformance.powerOn();
        mediumPerformance.loadGas(gasAmount);
        mediumPerformance.move(distance);
        System.out.println("----------------------------------");


        lowPerformance.setGasCapacity(2500);
        lowPerformance.powerOn();
        lowPerformance.loadGas(gasAmount);
        lowPerformance.move(distance);

        /**
         * after execution : output
         5000.0 Liters -  Amount of existing gas
         The car mileage :  10.0 Km
         ----------------------------------
         the gas is only for : 4.0 Km
         0.0 Liters -  Amount of existing gas
         The car mileage :  4.0 Km
         ----------------------------------
         500.0 Liters -  Amount of existing gas
         The car mileage :  5.0 Km

         */
    }

}
