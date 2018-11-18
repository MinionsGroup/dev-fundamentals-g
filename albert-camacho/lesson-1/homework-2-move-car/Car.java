
public class Car {
    private double gas;
    private double distance;
    private boolean isPowerOn;

    // How many Kilometers per liter
    private double gasConsume;

    private double tankCapacity;

    public Car(double tankCapacity, double gasConsume) {
        this.gas = 0;
        this.distance = 0;
        this.isPowerOn = false;
        this.tankCapacity = tankCapacity;
        this.gasConsume = gasConsume;
    }

    public void powerOn() {
        isPowerOn = true;
    }

    public void powerOff() {
        isPowerOn = false;
    }

    public double getGas() {
        return round(gas);
    }

    public double getDistance(){
        return round(distance);
    }

    public void fillTank(double liters) {
        double gasDifference = tankCapacity - gas;
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
        if (canMove()){
            double distanceToMove = distanceToMove(distance);
            this.distance += distanceToMove;
            gas -= distanceToMove/gasConsume;
        } else {
            System.out.println("The car can't move because the tank is empty");
        }
    }

    public void printStatus() {
        String status = isPowerOn ? "Power On" : "Power Off";
        String fmtText = "%-12s %-12s %-15s %-10s\n";

        System.out.printf(fmtText,"STATUS:", status, "ODOMETER:", getDistance() + " km");
        System.out.printf(fmtText,"GAS:", getGas() + " lts","TANK CAPACITY:", tankCapacity + " lts");
        System.out.printf(fmtText,"GAS CONSUME:", gasConsume + " Km/lt"," ", "");
    }

    private boolean canMove() {
        if (gas > 0){
            powerOn();
        } else {
            powerOff();
        }
        return isPowerOn;
    }

    private double distanceToMove(double distance) {
        double gasToBeConsumed = distance / gasConsume;
        if(gasToBeConsumed > gas) {
            return gas * gasConsume;
        }
        return distance;
    }

    // Round the value to two digits after the comma
    private double round(double number) {
        double scale = Math.pow(10, 2);
        return Math.round(number * scale) / scale;
    }
}
