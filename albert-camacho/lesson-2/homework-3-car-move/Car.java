
public class Car {
    private double gasCapacity;
    private double gasConsumption;
    private double gas;
    private double mileage;
    private boolean isPowerOn;

    public Car(double gasCapacity, double gasConsumption) {
        this.gas = 0;
        this.mileage = 0;
        this.isPowerOn = false;
        this.gasCapacity = gasCapacity;
        this.gasConsumption = gasConsumption;
    }

    public void powerOn() {
        isPowerOn = true;
    }

    public void powerOff() {
        isPowerOn = false;
    }

    public double getGas() {
        return gas;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean getIsPowerOn() {
        return isPowerOn;
    }

    public double getGasCapacity() {
        return gasCapacity;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void loadGas(double liters) {
        double gasDifference = gasCapacity - gas;
        if (liters <= gasDifference){
            gas =+ liters;
        } else if (gasDifference > 0 ) {
            gas += gasDifference;
            System.out.println("Alert: It was used only " + gasDifference + " of " + liters +
                               " liters, the tank is full now.");
        } else {
            System.out.println("Alert: The car doesn't requires gas, the tank is full!!. ");
        }
    }

    public void move(double distance) {
        if (gas > 0 && isPowerOn){
            double gasToConsume = distance / gasConsumption;
            double distanceToMove = distance;
            if (gasToConsume > gas) {
                distanceToMove = gas * gasConsumption;
            }

            this.mileage += distanceToMove;
            gas -= distanceToMove/gasConsumption;

            // The car will power-off automatically if gas is 0
            if (gas == 0) {
                powerOff();
            }
        } else {
            System.out.println("The car can't move because the tank is empty and/or it is power off");
        }
    }

}
