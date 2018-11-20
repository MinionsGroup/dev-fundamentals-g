package main;

import java.util.Scanner;

/**
 * This class build the car.
 *
 *  @author Jose Christian Galarza Crespo
 *  @version 1.0.
 */
class Car {
    private boolean statusEngine;
    private double gas;
    private double tankCapacity ;
    private double distanceMoved;
    private double performance;

    public Car(){
        statusEngine = false;
        gas = 0;
        distanceMoved = 0;
        this.tankCapacity = 100;
        this.performance = 0;
    }

    public Car(double tankCapacity, double performance) {
        statusEngine = false;
        gas = 0;
        distanceMoved = 0;
        this.tankCapacity = tankCapacity;
        this.performance = performance;
    }
    public void powerOn() {
        if (!statusEngine) {
            statusEngine = true;
        }
    }
    public void powerOff() {
        if (statusEngine) {
            statusEngine = false;
        }
    }
    public void fillGas(double gas) {
        if (tankCapacity >= (gas + gas))
            this.gas += gas;
        else {
            this.gas = tankCapacity;
            System.out.println("Extra gas " + (this.gas - gas));
        }
    }

    public void moveDistance(double distance) {
        if (statusEngine) {
            double spendGasoline = performance * distance;
            if (spendGasoline < gas) {
                gas -= spendGasoline;
                distanceMoved += distance;
                System.out.println("Gas spent: " + gas);
                System.out.println("Performance by distanceMoved moved: " + spendGasoline);
            } else {
                System.out.println("tank of gass empty, You need more gas for this distance");
            }
        } else {
            System.out.println("Turned off car, the car can't move.");
        }
    }
    public double carDistance() {
        System.out.println("Fill in with car's distance per gas: ");
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    public void printInformation() {
        System.out.println("Status Engine: " + statusEngine);
        System.out.println("Gas: " + gas);
        System.out.println("Gas Capacity: " + this.tankCapacity);
    }
}
