package main;

/**
 * This class build the car.
 *
 *  @author Jose Christian Galarza Crespo
 *  @version 1.0.
 */
class CarManager {
    private Car car= new Car();

    CarManager(double tankCapacity, double performance) {
        car.statusEngine = false;
        car.gas = 0;
        car.distanceMoved = 0;
        car.tankCapacity = tankCapacity;
        car.performance = performance;
    }
    void powerOn() {
        if (!car.statusEngine) {
            car.statusEngine = true;
        }
    }
    void powerOff() {
        if (car.statusEngine) {
            car.statusEngine = false;
        }
    }
    void fillGas(double gas) {
        if (this.car.tankCapacity >= (car.gas + gas))
            this.car.gas += gas;
        else {
            this.car.gas = car.tankCapacity;
            System.out.println("Extra gas " + (gas - this.car.gas));
        }
    }

    void moveDistance(double distance) {
        if (car.statusEngine) {
            double spendGasoline = car.performance * distance;
            if (spendGasoline < car.gas) {
                car.gas -= spendGasoline;
                car.distanceMoved += distance;
                System.out.println("Gas spent: " + car.gas);
                System.out.println("Performance by distanceMoved moved: " + spendGasoline);
            } else {
                System.out.println("tank of gass empty, You need more gas for this distance");
            }
        } else {
            System.out.println("Turned off car, the car can't move.");
        }
    }

    void printInformation() {
        System.out.println("Status Engine: " + car.statusEngine);
        System.out.println("Gas: " + car.gas);
        System.out.println("Gas Capacity: " + this.car.tankCapacity);
    }
}
