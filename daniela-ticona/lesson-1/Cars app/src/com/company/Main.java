package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

     CarsManager myCartManager = new CarsManager();

        myCartManager.addCar(new Cars("Daniela Ticona", 14.00 , 64.2));
        myCartManager.addCar(new Cars("Choi Siwon", 35.1 , 20.2));
        myCartManager.addCar(new Cars("Juan Perez", 1.5 , 88.2));
        //
         myCartManager.distancePerCar();


    }
}
