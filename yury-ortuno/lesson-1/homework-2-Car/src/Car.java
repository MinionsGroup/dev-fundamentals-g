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

    public static void main(String[] Args) {
        Car chevrolet = new Car("Chevrolet");
        Car nissan = new Car("Nissan");
        Car susuki = new Car("Susuki");

        // Gas Consume by kilometer
        double gasConsumeByKilometer;
        gasConsumeByKilometer = Math.random() * 0.1;
        chevrolet.setGasConsumeByKilometer(gasConsumeByKilometer);

        gasConsumeByKilometer = Math.random() * 0.1;
        nissan.setGasConsumeByKilometer(gasConsumeByKilometer);

        gasConsumeByKilometer = Math.random() * 0.1;
        susuki.setGasConsumeByKilometer(gasConsumeByKilometer);

        // Maximum capacity
        double maxCapacityGas;
        maxCapacityGas = Math.random() * 1000;
        chevrolet.setMaxCapacityGas(maxCapacityGas);

        maxCapacityGas = Math.random() * 1000;
        nissan.setMaxCapacityGas(maxCapacityGas);

        maxCapacityGas = Math.random() * 1000;
        susuki.setMaxCapacityGas(maxCapacityGas);

        // Fill gas
        double fillGas;
        fillGas = Math.random() * chevrolet.getMaxCapacityGas();
        chevrolet.fillGas(fillGas);

        fillGas = Math.random() * nissan.getMaxCapacityGas();
        nissan.fillGas(fillGas);

        fillGas = Math.random() * susuki.getMaxCapacityGas();
        susuki.fillGas(fillGas);

        // PowerOn car
        chevrolet.powerOn();
        nissan.powerOn();
        susuki.powerOn();

        // Route to the meta by kilometers
        double meta = 30.0;

        // Total distance traveled by car
        double distanceTraveledChevrolet = chevrolet.totalRouteCar();
        double distanceTraveledONissan = nissan.totalRouteCar();
        double distanceTraveledSusuki = susuki.totalRouteCar();

        // show result
        chevrolet.metaGoal(distanceTraveledChevrolet, meta);
        nissan.metaGoal(distanceTraveledONissan, meta);
        susuki.metaGoal(distanceTraveledSusuki, meta);
    }
}
