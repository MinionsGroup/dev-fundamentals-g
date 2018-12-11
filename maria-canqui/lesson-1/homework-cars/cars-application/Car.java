public class Car {
    private double distance;
    private double gasoline;
    private double maxGasoline;
    private double gasolineConsume;
    private boolean isPowerOn;

    /**
     * This method changes the Car PowerOn status
     * @param mileage distance to travel in km
     * @param gasoline initial gasoline
     * @param maxGasoline
     * @param gasolineConsume gasoline consume
     */
    Car(double mileage, double gasoline, double maxGasoline, double gasolineConsume) {
        this.isPowerOn = false;
        this.mileage = mileage;
        this.gasoline = gasoline;
        this.gasolineConsume = gasolineConsume;
        this.maxGasoline = maxGasoline;
    }

    /**
     * This method changes the Car PowerOn status
     * @param powerOn
     */
    public void setPowerOn (boolean powerOn) {
        String status = powerOn ? "Encendido": "Apagado";
        System.out.println("Changing the status car to: " + status);
        this.isPowerOn = powerOn;
    }

    /**
     * This method calculate the gasoline that the car will need to move
     * @return getGasolineRequired boolean
     */
    public double getGasolineRequired() {
        return this.distance * this.gasolineConsume;
    }
    /**
     * This method return the macGasoline
     * @return maxGasoline
     */
    public double getMaxGasoline() {
        return this.maxGasoline;
    }

    /**
     * This method set gasoline value
     */
    public void chargeGasoline(double gasoline) {
        if(gasoline < this.maxGasoline) {
            System.out.println("Charging " + gasoline + " gasoline");
            this.gasoline = gasoline;
        } else {
            System.out.println("The max gasoline that can charge is: "+ this.maxGasoline);       
        }
    }

    /**
     * This method return the current gasoline
     * @return gasoline
     */
    public double getGasoline() {
        return this.gasoline;
    }

    /**
     * This method return if the tank need gasoline
     * @return true =  need gasoline, false == not need gasoline
     */
    public boolean getTheCarNeedGasoline() {
        return getGasolineRequired() <= this.gasoline; 
    }

    /**
     * This method set the gasoline that the car will need to move
     */
    public int moveCar(double distance) {
        setPowerOn(true);
        if (getTheCarNeedGasoline()) {
            this.mileage += distance;
            System.out.println("Initial gasoline: " + this.gasoline);
            this.gasoline -= getGasolineRequired();
            System.out.println("Actual gasoline: " + this.gasoline);
            setPowerOn(false);
            return 1;
        } 
        setPowerOn(false);    
        return 2; 

    }
}
