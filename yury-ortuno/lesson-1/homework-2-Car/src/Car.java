/**
 * Created by Yury Ortuno on 11/13/2018.
 */
public class Car {
    private String mark;
    private double gas;
    private boolean isPowerOn;
    private double gasConsumeByKilometer;
    private double maxCapacityGas;

    public Car(String mark) {
        isPowerOn = false;
        this.mark = mark;
    }

    public void setGasConsumeByKilometer(double gasConsumeByKilometer) {
        this.gasConsumeByKilometer = gasConsumeByKilometer;
    }

    public double getGasConsumeByKilometer() {
        return gasConsumeByKilometer;
    }

    public void setMaxCapacityGas(double maxCapacityGas) {
        this.maxCapacityGas = maxCapacityGas;
    }

    public double getMaxCapacityGas() {
        return maxCapacityGas;
    }

    public boolean powerOn() {
        isPowerOn = true;
        return isPowerOn;
    }

    public boolean powerOff() {
        isPowerOn = false;
        return isPowerOn;
    }

    public void fillGas(double gas) {
        if (gas > maxCapacityGas) {
            this.gas = maxCapacityGas;
        } else {
            this.gas = gas;
        }
    }

    public double totalRouteCar() {
        return gasConsumeByKilometer * gas;
    }

    public void metaGoal(double totalRouteCar, double meta) {
        System.out.println("////////////////////////////////////////===");
        if (totalRouteCar >= meta) {
            System.out.println("The car " + mark + " completed the race");
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
