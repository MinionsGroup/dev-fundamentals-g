public class Main {
    public static void main(String args[]) {
        double distance = 100.0;

        Car car1 = new Car(120.0, 5);
        Car car2 = new Car( 100.0, 4);
        Car car3 = new Car( 130.0, 7);

        car1.fillGas(80);
        car2.fillGas(90);
        car2.fillGas(50);

        car1.powerOn();
        car2.powerOn();
        car3.powerOn();

        car1.move(distance);
        car2.move(distance);
        car3.move(distance);

        System.out.println(car1.getGas());
        System.out.println(car2.getGas());
        System.out.println(car3.getGas());

        car1.powerOff();
        car2.powerOff();
        car3.powerOff();

    }
}
