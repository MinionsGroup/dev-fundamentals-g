public class Auto {
    private double gas;
    private double capacityGas;
    private double kilometraje;
    private boolean powerOn;
    private double performance; //l/km


    public Auto(double capacityGas, double performance)
    {
        powerOn = false;
        kilometraje = 0; //km
        gas = 0;
        this.capacityGas = capacityGas;
        this.performance = performance;
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
    /**
     * Move Car
     * spend gas = total km/gas
     * */
    public void Move (double distancia){
        if(powerOn) {
            double consumeGas = this.performance * distancia;
            if (consumeGas > gas) {
                System.out.println("It is not possible to continue, gas is not enough ");
            } else {
                gas -= consumeGas;
                this.kilometraje += distancia;
            }
        }
        else
        {
            System.out.println("Car is powerOff, it is not possible to move");
        }
    }

    public void ShowCurentCarInformation()
    {
        System.out.println("Power off/on: " + powerOn);
        System.out.println("Gas: " + gas);
        System.out.println("Gas Capacity: " + this.capacityGas);
        System.out.println("Mileage: " + kilometraje);
    }
}
