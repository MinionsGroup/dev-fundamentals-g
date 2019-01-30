public class Car {
    private boolean isPowerOn;
    private double gas;
    private double gasCapacity;
    private double mileage;
    private double gasConsumption;

    public Car() {
        isPowerOn = false;
        gas = 0;
        mileage = 0;
        this.gasCapacity = 100;
        this.gasConsumption = 0;
    }

    public Car(double gasCapacity, double gasConsumption) {
        isPowerOn = false;
        gas = 0;
        mileage = 0;
        this.gasCapacity = gasCapacity;
        this.gasConsumption = gasConsumption;
    }

    public void powerOn() {
        if (!isPowerOn) {
            isPowerOn = true;
        }
    }

    public void powerOff() {
        if (isPowerOn) {
            isPowerOn = false;
        }
    }

    public void moveDistance(double distance) {
        if (isPowerOn) {
            double spendGasoline = this.gasConsumption * distance;
            if (spendGasoline < gas) {
                gas -= spendGasoline;
                mileage += distance;
                System.out.println("Gas spent: " + gas);
                System.out.println("Performance by mileage moved: " + spendGasoline);
            } else {
                System.out.println("Not enough gas stranger!!");
            }
        } else {
            System.out.println("Turned off car, can't move.");
        }
    }

    public void fillGas(double gas) {
        if (this.gasCapacity >= (this.gas + gas))
            this.gas += gas;
        else {
            this.gas = gasCapacity;
            System.out.println("Extra gas " + (gas - this.gas));
        }
    }

    public void displayInformation() {
        System.out.println("Status Engine: " + isPowerOn);
        System.out.println("Gas: " + gas);
        System.out.println("Gas Capacity: " + this.gasCapacity);
    }
}