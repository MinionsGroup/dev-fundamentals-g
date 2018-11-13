package com.company;

public class MainCar {
    public static void main(String []arg){
        Car car1 = new Car("1995", "Toyota",12);
        car1.setGasoline(10);
        car1.setUsedGas(0);
        car1.setMaxGasFill(40);
        car1.fillFullGas(10);
        car1.powerOn();
        car1.move(200);
        car1.showCarInformation();

        Car car2 = new Car("2010", "Nissan",12);
        car2.setGasoline(10);
        car2.setUsedGas(0);
        car2.setMaxGasFill(40);
        car2.fillFullGas(0);
        car2.powerOn();
        car2.move(200);
        car2.showCarInformation();

        Car car3 = new Car("2003", "Ford",12);
        car3.setGasoline(10);
        car3.setUsedGas(0);
        car3.setMaxGasFill(40);
        car3.fillFullGas(30);
        car3.powerOn();
        car3.move(200);
        car3.showCarInformation();
    }
}
