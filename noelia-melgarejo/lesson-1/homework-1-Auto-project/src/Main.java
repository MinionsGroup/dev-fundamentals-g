import java.util.*;

public class Main {


    public static void main(String[] args) {
        double  distance  = 20;
        double gasAmount = 40;
        /**
         * Creating 3 cars with different features
         */
        Auto autoHighPerformace = new Auto(100);
        autoHighPerformace.setSpeed(60);
        autoHighPerformace.setCapacityGas(200);

        Auto autoMediumPerformace = new Auto(50);
        autoMediumPerformace.setSpeed(20);
        autoMediumPerformace.setCapacityGas(100);


        Auto autoLowPerformace = new Auto(25);
        autoLowPerformace.setSpeed(10);
        autoLowPerformace.setCapacityGas(50);
        ArrayList<Auto> autos = new ArrayList<Auto>();
        autos.add(autoMediumPerformace); //adding each car
        autos.add(autoLowPerformace);
        autos.add(autoHighPerformace);

        for (Auto auto : autos) {
            auto.powerOn();
            auto.fillGas(gasAmount);
            auto.move(distance);
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

}
