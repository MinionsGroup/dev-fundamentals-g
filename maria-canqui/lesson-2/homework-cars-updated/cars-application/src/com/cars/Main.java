package com.cars;

import java.io.FileNotFoundException;


class Main {
    public static void main (String [] args) throws FileNotFoundException {

        ReadFile info = new ReadFile();

        Double distance = info.readDistance(1);

        Car car1 = new Car(info.readGas(), 100, 1);
        car1.setPowerOn(true);
        car1.move(distance);

        distance = info.readDistance(2);
        Car car2 = new Car(info.readGas(), 50, 2);
        car2.setPowerOn(true);
        car2.move(distance);

        distance = info.readDistance(3);
        Car car3 = new Car(info.readGas(), 100, 2);
        car3.setPowerOn(true);
        car3.move(distance);
    }
}
