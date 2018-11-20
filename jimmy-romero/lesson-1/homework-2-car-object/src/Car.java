public class Car {
    private boolean statusEngine;
    private double gas;
    private double tankCapacity;
    private double distanceMoved;
    private double performance;

    public Car() {
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

    public void moveDistance(double distance) {
        if (statusEngine) {
            double spendGasoline = this.performance * distance;
            if (spendGasoline < gas) {
                gas -= spendGasoline;
                distanceMoved += distance;
                System.out.println("Gas spent: " + gas);
                System.out.println("Performance by distanceMoved moved: " + spendGasoline);
            } else {
                System.out.println("Not enough gas stranger!!");
            }
        } else {
            System.out.println("Turned off car, can't move.");
        }
    }

    public void fillGas(double gas) {
        if (this.tankCapacity >= (this.gas + gas))
            this.gas += gas;
        else {
            this.gas = tankCapacity;
            System.out.println("Extra gas " + (gas - this.gas));
        }
    }

    public void displayInformation() {
        System.out.println("Status Engine: " + statusEngine);
        System.out.println("Gas: " + gas);
        System.out.println("Gas Capacity: " + this.tankCapacity);
    }
}
