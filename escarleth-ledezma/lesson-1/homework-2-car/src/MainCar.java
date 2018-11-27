public class MainCar {
    public static void main(String args[]) {
        double distance = 120.0;
        Car car1 = new Car(120.0, 10);
        Car car2 = new Car( 100.0, 4);
        Car car3 = new Car( 130.0, 15);
        car1.fillGas(10);
        car2.fillGas(90);
        car3.fillGas(140);
        car1.powerOn();
        car2.powerOn();
        car3.powerOn();
        car1.move(distance);
        car2.move(distance);
        car3.move(distance);

        System.out.println("***************CAR 1***************");
        System.out.println(String.format("GAS: %s",car1.getGas()));
        System.out.println(String.format("MILEAGE: %s",car1.getMileage()));
        System.out.println("***************CAR 2***************");
        System.out.println(String.format("GAS: %s",car2.getGas()));
        System.out.println(String.format("MILEAGE: %s",car2.getMileage()));
        System.out.println("***************CAR 3***************");
        System.out.println(String.format("GAS: %s",car3.getGas()));
        System.out.println(String.format("MILEAGE: %s",car3.getMileage()));

        car1.powerOff();
        car2.powerOff();
        car3.powerOff();
    }
}
