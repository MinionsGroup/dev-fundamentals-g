public class Main {
    public static void main(String[] args) {
        Car chapatin = new Car();
        Car lancer = new Car(60, 0.07);
        Car supra = new Car(65, 0.04);
        Car civic = new Car(55, 0.05);

        lancer.fillGas(50);
        supra.fillGas(45);
        civic.fillGas(50);

        chapatin.powerOff();
        lancer.powerOn();
        supra.powerOn();
        civic.powerOn();

        chapatin.moveDistance(50);
        System.out.println("-- Chapatin --");
        chapatin.displayInformation();

        lancer.moveDistance(50);
        System.out.println("-- Lancer --");
        lancer.displayInformation();

        supra.moveDistance(50);
        System.out.println("-- Supra --");
        supra.displayInformation();

        civic.moveDistance(50);
        System.out.println("-- Civic --");
        civic.displayInformation();
    }
}
