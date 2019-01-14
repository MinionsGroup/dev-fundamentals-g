package com.company;
import java.io.*;


public class CarsManager {

    double gas = 40.00;
    double distance = 100.00;
    boolean powerOn = false;
    double gasTank = 100.00;
    boolean hasGas = true;
    double maxGas = 0.0;


   // double distanceGas[] = new double [50];
    //double distanceGas[0]= {0.0};

    Cars[] myCars;
    int carCount;

    CarsManager(){
        carCount = 0;
        myCars = new Cars[500];


    }

    void addCar(Cars car) {
        myCars[carCount] = car;
        carCount++;
    }
        // Display ALL players
     public void showAll () {
        System.out.println("  --*-*-*-*-*-*-*-*-*-*-* PLAYERS-*-*-*-*-*-*-*-*-*-*--*- ");
            for (int i = 0; i < carCount; i++) {
                System.out.println(i + 1 + ".- " + myCars[i].nameplayer + "        " + myCars[i].performace + " kilometers/lts       " + myCars[i].gasTank+ " Liters of gasoline in the tank " +myCars[i].distance+" distance in kilometers");

            }
        }
        // Calculate the distance with relation performance(kilometers/liters) and gas in the tank(liters)
      void  distancePerCar  () {
         double distanceGas[] = new double [50];

        System.out.println( "*-*-*-*-*- Final distance related with performance and gas in the tank are: ");

         for (int i = 0; i < carCount; i++) {
         distanceGas[i] = myCars[i].performace * myCars[i].gasTank;
         System.out.println( +i+".- The distance traveled by the player " +myCars[i].nameplayer+" is:  "+distanceGas[i]+" Kilometers");
          //System.out.println(distanceGas[i]);

         }

     }
}




