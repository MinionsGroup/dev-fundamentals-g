public class Auto {
    private double gas;
    private double capacityGas;
    private double kilometraje;
    private boolean powerOn;
    private double performance; //l/km
    private double distance;


    public Auto(double capacityGas, double performance)
    {
        powerOn = false;
        kilometraje = 0; //km
        gas = 0;
        this.capacityGas = capacityGas;
        this.performance = performance;
    }

    public Auto(){
        powerOn = false;
        kilometraje = 0; //km
        gas = 0;
        distance = 0;
    }

    public void SetGas(double gas){
        this.gas = gas;
    }
    public void PowerOn(){
        powerOn = true;
    }

    public void PowerOff(){
        powerOn = false;
    }

    public void FillGasolina(double gas){
        if((this.gas + gas) <= this.capacityGas)
            this.gas += gas;
        else{
            this.gas = capacityGas;
            System.out.println("Extra gas "+ (gas - this.gas));
        }

    }

    public void setPerformance(double performance)
    {
        this.performance = performance;
    }
    public void SetDistance(double distance)
    {
        this.distance = distance;
    }

    public double getPerformance()
    {
        return performance;
    }

    /**
     * Move Car
     * spend gas = total km/gas
     * */
    public void Move (double distancia){
        if(powerOn) {
            double consumeGas = this.performance * distancia;
            if (consumeGas > gas) {
                double distance = consumeGas/this.performance;
                gas = 0;
                this.kilometraje += distance;
                System.out.println("You can continue only  " +  distance + " km more");
            } else {
                gas -= consumeGas;
                this.kilometraje += distancia;
            }
            System.out.println("you have traveled by car" +  this.kilometraje + " km");
        }
        else
        {
            System.out.println("Car is powerOff, it is not possible to move");
        }
    }

    public void Move(){
        Move(distance);
    }

    public void ShowCurentCarInformation()
    {
        System.out.println("Power off/on: " + powerOn);
        System.out.println("Gas: " + gas);
        System.out.println("Gas Capacity: " + this.capacityGas);
        System.out.println("Mileage: " + kilometraje);
    }
}
