public class Auto {
    private double gas;
    private double gasCapacity;
    private double mileage;
    private boolean isPowerOn;
    private double gasConsumption; //l/km


    public Auto(double gasCapacity, double performance)
    {
        isPowerOn = false;
        mileage = 0; //km
        gas = 0;
        this.gasCapacity = gasCapacity;
        this.gasConsumption = performance;
    }
    public void PowerOn(){
        isPowerOn = true;
    }

    public void PowerOff(){
        isPowerOn = false;
    }

    public void LoadGas(double gas){
        if((this.gas + gas) <= this.gasCapacity)
            this.gas += gas;
        else{
            this.gas = gasCapacity;
            System.out.println("Extra gas "+ (gas - this.gas));
        }

    }
    /**
     * Move Car
     * spend gas = total km/gas
     * */
    public void Move (double distancia){
        if(isPowerOn) {
            double consumeGas = this.gasConsumption * distancia;
            if (consumeGas > gas) {
                double distance = consumeGas/this.gasConsumption;
                gas = 0;
                this.mileage += distance;
                System.out.println("You can continue only  " +  distance + " km more");
            } else {
                gas -= consumeGas;
                this.mileage += distancia;
            }
            System.out.println("you have traveled by car" +  this.mileage + " km");
        }
        else
        {
            System.out.println("Car is powerOff, it is not possible to move");
        }
    }

    public void ShowCurentCarInformation()
    {
        System.out.println("Power off/on: " + isPowerOn);
        System.out.println("Gas: " + gas);
        System.out.println("Gas Capacity: " + this.gasCapacity);
        System.out.println("Mileage: " + mileage);
    }
}
