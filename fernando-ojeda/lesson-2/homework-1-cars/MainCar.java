package com.company;

import java.util.List;
import java.util.Scanner;

public class MainCar {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        FileCar fileCar = new FileCar();
        List<String> gasoline = fileCar.readFile();
        for (String aGasoline : gasoline) {
            String[] gasData = aGasoline.split(" ");
            switch (gasData[0]) {
                case "Toyota":
                    System.out.println("Please introduce the fuel efficiency for the car " + gasData[0]);
                    int fuelEfficiency = scanner.nextInt();
                    Car car1 = new Car("1995", "Toyota", fuelEfficiency);
                    double usedGas = 0;
                    double maxGasFill = 40;
                    double gasInTank = 0;
                    carInformation(gasData[1], car1, usedGas, maxGasFill, gasInTank);
                    break;
                case "Nissan":
                    System.out.println("Please introduce the fuel efficiency for the car " + gasData[0]);
                    int fuelEfficiency2 = scanner.nextInt();
                    Car car2 = new Car("2010", "Nissan", fuelEfficiency2);
                    double usedGas2 = 0;
                    double maxGasFill2 = 40;
                    double gasInTank2 = 0;
                    carInformation(gasData[1], car2, usedGas2, maxGasFill2, gasInTank2);
                    break;
                case "Ford":
                    System.out.println("Please introduce the fuel efficiency for the car " + gasData[0]);
                    int fuelEfficiency3 = scanner.nextInt();
                    Car car3 = new Car("2003", "Ford", fuelEfficiency3);
                    double usedGas3 = 0;
                    double maxGasFill3 = 40;
                    double gasInTank3 = 0;
                    carInformation(gasData[1], car3, usedGas3, maxGasFill3, gasInTank3);
                    break;
            }
        }
    }

    private static void carInformation(String gasData, Car car, double usedGas, double maxGasFill,
                                       double gasInTank) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please introduce the distance you want the car " + car.getBrand() + " travel");
        double distance = scanner.nextDouble();
        car.setGasoline(gasInTank);
        car.setUsedGas(usedGas);
        car.setMaxGasFill(maxGasFill);
        car.fillFullGas(Double.parseDouble(gasData));
        car.powerOn();
        car.move(distance);
        car.showCarInformation();
    }
}
