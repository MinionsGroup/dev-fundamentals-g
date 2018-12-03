/**
 * Created by Yury Ortuno on 11/13/2018.
 */
public class Car {
    private double gas;
    private boolean isPowerOn;
    private double gasConsumeByKilometer;
    private double maxCapacityGas;

    Car() {
        isPowerOn = false;
    }

    void setGasConsumeByKilometer(double gasConsumeByKilometer) {
        this.gasConsumeByKilometer = gasConsumeByKilometer;
    }

    public double getGasConsumeByKilometer() {
        return gasConsumeByKilometer;
    }

    void setMaxCapacityGas(double maxCapacityGas) {
        this.maxCapacityGas = maxCapacityGas;
    }

    double getMaxCapacityGas() {
        return maxCapacityGas;
    }

    void powerOn() {
        isPowerOn = true;
    }

    void powerOff() {
        isPowerOn = false;
    }

    void fillGas(double gas) {
        this.gas = gas;
    }

    double totalRouteCar() {
        return gasConsumeByKilometer * gas;
    }

    void metaGoal(double totalRouteCar, double meta) {
        System.out.println("////////////////////////////////////////===");
        if (totalRouteCar >= meta) {
            System.out.println(" ROUTE COMPLETED!");
            for (int kilometer = 1; kilometer <= 10; kilometer++) {
                System.out.print("\t");
            }
        } else {
            for (int kilometer = 1; kilometer <= (totalRouteCar / meta) * 10; kilometer++) {
                System.out.print("\t");
            }
        }
        System.out.println("o-o");
        System.out.println("////////////////////////////////////////===\n");
    }
}
