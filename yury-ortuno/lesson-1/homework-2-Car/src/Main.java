/**
 * Created by Yury Ortuno on 11/13/2018.
 */
public class Main {
    public static void main(String[] Args) {
        Car chevrolet = new Car();
        Car nissan = new Car();
        Car suzuki = new Car();

        // Gas Consume by kilometer
        double gasConsumeByKilometer;
        gasConsumeByKilometer = Math.random() * 0.1;
        chevrolet.setGasConsumeByKilometer(gasConsumeByKilometer);

        gasConsumeByKilometer = Math.random() * 0.1;
        nissan.setGasConsumeByKilometer(gasConsumeByKilometer);

        gasConsumeByKilometer = Math.random() * 0.1;
        suzuki.setGasConsumeByKilometer(gasConsumeByKilometer);

        // Maximum capacity
        double maxCapacityGas;
        maxCapacityGas = Math.random() * 1000;
        chevrolet.setMaxCapacityGas(maxCapacityGas);

        maxCapacityGas = Math.random() * 1000;
        nissan.setMaxCapacityGas(maxCapacityGas);

        maxCapacityGas = Math.random() * 1000;
        suzuki.setMaxCapacityGas(maxCapacityGas);

        // Fill gas
        double fillGas;
        fillGas = Math.random() * chevrolet.getMaxCapacityGas();
        chevrolet.fillGas(fillGas);

        fillGas = Math.random() * nissan.getMaxCapacityGas();
        nissan.fillGas(fillGas);

        fillGas = Math.random() * suzuki.getMaxCapacityGas();
        suzuki.fillGas(fillGas);

        // PowerOn car
        chevrolet.powerOn();
        nissan.powerOn();
        suzuki.powerOn();

        // Route to the meta by kilometers
        double meta = 30.0;

        // Total distance traveled by car
        double distanceTraveledChevrolet = chevrolet.totalRouteCar();
        double distanceTraveledONissan = nissan.totalRouteCar();
        double distanceTraveledSusuki = suzuki.totalRouteCar();

        // show result
        chevrolet.metaGoal(distanceTraveledChevrolet, meta);
        nissan.metaGoal(distanceTraveledONissan, meta);
        suzuki.metaGoal(distanceTraveledSusuki, meta);
    }
}
