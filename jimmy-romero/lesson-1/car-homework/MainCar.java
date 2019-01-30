import java.io.FileNotFoundException;

public class MainCar {
    public static void main(String[] args) throws FileNotFoundException {
        Car chapatin = new Car();
        Car lancer = new Car(60, 0.07);
        Car supra = new Car(65, 0.04);
        Car civic = new Car(55, 0.05);

        DataManager data = new DataManager();
        double amountOfGas = data.loadGas();

        lancer.fillGas(amountOfGas );
        supra.fillGas(amountOfGas );
        civic.fillGas(amountOfGas );

        chapatin.powerOff();
        lancer.powerOn();
        supra.powerOn();
        civic.powerOn();

        double distance = data.carDistance();
        chapatin.moveDistance(distance);
        System.out.println("-- Chapatin --");
        chapatin.displayInformation();
        lancer.moveDistance(distance);
        System.out.println("-- Lancer --");
        lancer.displayInformation();
        supra.moveDistance(distance);
        System.out.println("-- Supra --");
        supra.displayInformation();
        civic.moveDistance(distance);
        System.out.println("-- Civic --");
        civic.displayInformation();
    }
}
