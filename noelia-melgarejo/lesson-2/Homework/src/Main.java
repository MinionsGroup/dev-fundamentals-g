import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        double gasAmount = 0;
        double distance = 0;
        Auto autoHighPerformace = null;
        Auto autoMediumPerformace = null;
        Auto autoLowPerformace = null;

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


        /**
         * Creating 3 cars with different features
         */
        for (int i = 0; i < 3; i++) {
            System.out.print("--------Enter performance of car  : " + (i + 1) + " and press enter" + "\n");
            performance = scanner.nextInt(); // Reading performance
            autoHighPerformace = new Auto(performance);
            autoMediumPerformace = new Auto(performance);
            autoLowPerformace = new Auto(performance);
        }

        autoHighPerformace.setSpeed(60);
        autoHighPerformace.setCapacityGas(200);


        autoMediumPerformace.setSpeed(20);
        autoMediumPerformace.setCapacityGas(100);


        autoLowPerformace.setSpeed(10);
        autoLowPerformace.setCapacityGas(50);

        ArrayList<Auto> autos = new ArrayList<Auto>();
        autos.add(autoMediumPerformace); //adding each car
        autos.add(autoLowPerformace);
        autos.add(autoHighPerformace);

        for (Auto auto : autos) {
            auto.powerOn();
            auto.move(distance);
            auto.fillGas(gasAmount);
            auto.timeMove();
        }


        autos.sort(Comparator.comparing(Auto::getTime));  //Order according to Time adding the interface Comparable in Auto
        System.out.print("--------Order of arrival of  a distance of " + distance + "Km------------ \n");
        for (int i = 0; i < autos.size(); i++) {
            System.out.print(i + 1 + ".-" + "Time  " + autos.get(i).getTime() + " Hours \n");
            System.out.print("Car with speed " + autos.get(i).getSpeed() + " Km/H \n");
            System.out.print("Car with performance " + autos.get(i).getPerformance() + " litres/Km \n");
            System.out.print("--------------------------------------------------" + "\n");
        }


    }


    /**
     * after execution : output
     * --------Order of arrival of  a distance of 20.0Km------------
     1.-Time  0.3333333333333333 Hours
     Car with speed 60.0 Km/H
     Car with performance 100.0 litres/Km
     --------------------------------------------------
     2.-Time  1.0 Hours
     Car with speed 20.0 Km/H
     Car with performance 50.0 litres/Km
     --------------------------------------------------
     3.-Time  2.0 Hours
     Car with speed 10.0 Km/H
     Car with performance 25.0 litres/Km
     --------------------------------------------------
     */


}
