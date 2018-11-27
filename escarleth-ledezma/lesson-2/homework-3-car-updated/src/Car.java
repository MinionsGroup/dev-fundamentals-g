public class Car {
    private double gas;
    private boolean powerON;
    private double maxThankCapacity;
    private double gasConsumption; //   distance/liters
    private double mileage;

    public Car(double maxThankCapacity, double gasConsumption) {
        gas = 0;
        mileage = 0;
        this.maxThankCapacity = maxThankCapacity;
        this.gasConsumption = gasConsumption;
    }

    public void powerOn() {
        powerON = true;
    }

    public void powerOff() {
        powerON = false;
    }

    public void fillGas(double gasToFill) {
        gas = (gas + gasToFill) <= maxThankCapacity ? gas + gasToFill : maxThankCapacity;
    }

    public void move(double distance) {
        mileage = gas * gasConsumption;
        if (powerON && gas != 0) {
            gas = distance <= mileage ? gas - (1 / gasConsumption * distance) : 0.0;
            mileage += gas != 0 ? distance : mileage;
        } else {
            System.out.println("Turn on the car and fill the gas");
        }
    }

    public double getGas() {
        return gas;
    }

    public double getMileage() {
        return mileage;
    }
}
