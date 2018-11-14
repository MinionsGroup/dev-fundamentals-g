public class Main {
    public static void main(String args[]) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setMaxConsume(0.1);
        car2.setMaxConsume(0.12);
        car3.setMaxConsume(0.18);

        car1.setMaxGas(40);
        car2.setMaxGas(30);
        car3.setMaxGas(50);

        car1.setDistance(100);
        car2.setDistance(100);
        car3.setDistance(100);

        car1.setGas(25);
        car2.setGas(9);
        car3.setGas(14);

        car1.setPowerOn(false);
        car2.setPowerOn(false);
        car3.setPowerOn(false);

    }
}
