import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //* Creating 3 cars with different features

        Auto highPerformance = new Auto(500);
        highPerformance.setGasCapacity(10000);
        highPerformance.powerOn();
        highPerformance.loadGas(5000);
        highPerformance.move(10);
        System.out.println("----------------------------------");


        Auto mediumPerformance = new Auto(250);
        mediumPerformance.setGasCapacity(5000);
        mediumPerformance.powerOn();
        mediumPerformance.loadGas(1000);
        mediumPerformance.move(10);
        System.out.println("----------------------------------");


        Auto lowPerformance = new Auto(100);
        lowPerformance.setGasCapacity(2500);
        lowPerformance.powerOn();
        lowPerformance.loadGas(1000);
        lowPerformance.move(5);

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
