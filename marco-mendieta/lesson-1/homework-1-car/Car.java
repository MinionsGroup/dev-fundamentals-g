public class Car {

    private double gas;
    private double distance;
    private boolean isPoweredOn;
    private double performance;

    public Car(){
        this.gas = 0;
        this.distance = 0;
        this.isPoweredOn = false;
        // kilometer per liter
        this.performance = 10;
    }

	// getters and setters
    public boolean getIsPoweredOn(){
        return this.isPoweredOn;
    }

    public void setIsPoweredOn(boolean isPoweredOn){
        this.isPoweredOn = true;
    }

    public double getGas(){
        return this.gas;
    }

    public void setGas(double gas){
        this.gas = gas;
    }

    public double getDistance(){
        return this.distance;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getPerformance(){
        return this.performance;
    }

    public void setPerformance(double performance){
        this.performance = performance;
    }

	// move the car
    public void move(double distance){
        if (!getIsPoweredOn()){
            setIsPoweredOn(true);
            System.out.println("The car is powered on ");
        }
        if (canMove(distance)){
            setDistance(getDistance() + distance);
            System.out.println("The car is moving for " + getDistance() + " kilometers");
            setGas(getGas() - getGasWasted(distance));
        }
        else System.out.println("The car does not have enough gas");
    }

    public void refillGas(double gas){
     setGas(getGas() + gas);
        System.out.println("The car has " + getGas() + " liter");
    }

    public boolean canMove(double distance){
        if (getGas() > 0 && isGasEnoughForDistance(distance)){
            System.out.println("The car can move for " + distance + " kilometers");
            return true;
        }else {
            System.out.println("The car cannot move for " + distance + " kilometers");
            return false;
        }
    }

    private boolean isGasEnoughForDistance(double distance){
        // performance = distance/gas
        // distance = performance * gas
        if (distance <= getPerformance()*gas){
            System.out.println("The distance: " + distance + " can be finished with " + getGas() + " liter");
            return true;
        }
        else{
            System.out.println("The distance: " + distance + " can not be finished with " + getGas() + " liter");
            return false;
        }
    }

    private double getGasWasted(double distance){
        // performance = distance/gas
        // gas = distance/performance
        return distance/getPerformance();
    }

    public static void main(String [] args){
        Car carWithoutGas = new Car();
        carWithoutGas.move(10);
        carWithoutGas.refillGas(50);
        carWithoutGas.move(10);
        carWithoutGas.refillGas(500);
        carWithoutGas.move(10);
        carWithoutGas.canMove(50);
        carWithoutGas.canMove(6000);
        carWithoutGas.move(6000);
    }
}
