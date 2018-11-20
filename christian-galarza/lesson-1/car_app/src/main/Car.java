package main;

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

    Car() {
        statusEngine = false;
        gas = 0;
        distanceMoved = 0;
        tankCapacity = 0;
        performance = 0;
        distanceMoved = 0;
    }
    void powerOn() {
        if (!statusEngine) {
            statusEngine = true;
        }
    }
    void powerOff() {
        if (statusEngine) {
            statusEngine = false;
        }
    }
    void fillGas(double gas) {
        if (this.tankCapacity >= (gas + gas))
            this.gas += gas;
        else {
            this.gas = tankCapacity;
            System.out.println("Extra gas " + (gas - this.gas));
        }
    }

    void moveDistance(double distance) {
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

    void printInformation() {
        System.out.println("Status Engine: " + statusEngine);
        System.out.println("Gas: " + gas);
        System.out.println("Gas Capacity: " + this.tankCapacity);
    }
}
