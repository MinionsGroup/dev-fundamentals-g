package com.company;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        CarsManager myCartManager = new CarsManager();
        Scanner scanner = new Scanner(System.in);
       double distance = 100.00;

        if (args.length>0){
            try{
                distance = Double.parseDouble(args[0]);
            }
            catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an double.");
                System.exit(1);
            }

        }

        System.out.println("Esta es distancia" +distance);



        myCartManager.distancePerCar();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the " + i + " player name: ");
            String nameplayer = scanner.next();
           // System.out.println("Enter the distance in Kilometers for " + i + " car:");
            //double distance = scanner.nextDouble();
            System.out.println("Enter the performance in Km/lts of the " + i + "car ");
            double performance = scanner.nextDouble();



            myCartManager.addCar(new Cars(nameplayer, performance, getGasTankfromFile(),distance));
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        }
        myCartManager.showAll();
    }

    // Lee el archivo.txt con la capacidad del tank  gasolina
    public static Double getGasTankfromFile() {

        double gasTank = 00.0;
        try {
            File archivo = new File("archivo.txt");
            Scanner scanner = new Scanner(archivo);
            gasTank = scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gasTank;
    }

    public static Double getkilometerfromCommandLine(String  args []) {
        double performance=00.0;
        if (args.length > 0) {
            try {
                performance = Double.parseDouble(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }
        return performance;

    }

}
