public class Auto implements Comparable<Auto>{
    private double gas;
    private double distance;
    private boolean powerOn;
    private double gasConsume;
    private double capacityGas;
    private double performance;
    private double speed;
    private double time;

    /**
     *
     * @param performanceGas values litros/1KM
     */
    //litros /km
    public Auto(double performanceGas) {
        gas = 0;
        gasConsume = 0;
        distance =0;
        performance = performanceGas;
        powerOn = false;
    }
    /**
     * Returns the distance
     * @return
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Sets distance
     * @param distance values in KM
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Gets the time
     * @return
     */
    public double getTime() {
        return time;
    }

    /**
     * Sets the time
     * @param time value in hours
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * return the speed (km/1hour)
     * @return
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Set the speed
     * @param speed value in (Km/1 hour)
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Gets the performance (litre/1Km)
     * @return
     */
    public double getPerformance() {
        return performance;
    }

    /**
     * Sets the performance (litre/1Km)
     * @param performance
     */
    public void setPerformance(double performance) {
        this.performance = performance;
    }

    /**
     * Gets the gas
     * @return
     */
    public double getGas() {
        return gas;
    }

    /**
     * Sets the gas
     * @param gas
     */
    public void setGas(double gas) {
        this.gas = gas;
    }

    /**
     * Gets Power on in the car
     * @return
     */
    public boolean isPowerOn() {
        return powerOn;
    }

    /**
     * Sets to power on
     * @param powerOn value true or false
     */
    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    /**
     * Returns the gas consume
     * @return
     */
    public double getGasConsume() {
        return gasConsume;
    }

    /**
     * Sets the gas consume
     * @param gasConsume value of gas
     */

    public void setGasConsume(double gasConsume) {
        this.gasConsume = gasConsume;
    }

    /**
     * Gets capacity max of gas
     * @return
     */
    public double getCapacityGas() {
        return capacityGas;
    }

    /**
     * Sets the capacity of gas
     * @param capacityGas value of max capacity
     */
    public void setCapacityGas(double capacityGas) {
        this.capacityGas = capacityGas;
    }

    /**
     * power on the car
     */
    public void powerOn() {

        this.setPowerOn(true);
    }

    /**
     * power off Car
     */
    public void powerOff() {
        this.setPowerOn(false);
    }

    /**
     * Adds gas
     * @param gasAmount value gas
     */
    public void fillGas(double gasAmount) {
        if(gasAmount<capacityGas)
            gas = gas + gasAmount;
        else System.out.println("the amount the gas is over capacity , enter less gas amount");

    }

    /**
     * Time of driving time
     * @return
     */
    public double timeMove(){
        time = distance*1/speed; // ( hora/km *km  )

        return time;
    }

    /**
     * move the car
     * @param distanceToMove value distance
     */
    public void move(double distanceToMove) {
        distance = distanceToMove;
        gasConsume = (performance) * distance;
        gas = gas - gasConsume;

    }
    public void showGas(){
        if (gas < 0) {
            System.out.println("there is no gas");
        }

        if (gas == 0) {
            System.out.println("there is no gas"+gas+"Distance "+distance+"Hours:"+ time);
        }
        if (gas > 0) {
            System.out.println("Exist gas"+gas+"Distance"+distance+"Hours:"+ time);
        }

    }

    /**
     * Returns if the car can move
     * @return
     */
    public boolean canMove() {

        return gas > 0;

    }

    /**
     * Compare the arrival Time of a car
     * @param auto value auto class
     * @return
     */
    @Override
    public int compareTo(Auto auto) {
        double compareQuantity = ((Auto) auto).getTime();

        //ascending order
        return (int) (this.getTime() - compareQuantity);
    }
}

