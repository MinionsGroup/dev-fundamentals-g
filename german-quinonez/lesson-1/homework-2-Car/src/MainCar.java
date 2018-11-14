public class MainCar {
    public static void main(String args[]) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setCapacity(Math.random() * 100);
        car2.setCapacity(Math.random() * 100);
        car3.setCapacity(Math.random() * 100);


        car1.setGasConsume(Math.random() * 100);
        car2.setGasConsume(Math.random() * 100);
        car3.setGasConsume(Math.random() * 100);

        car1.fillGas(Math.random() * 100);
        car2.fillGas(Math.random() * 100);
        car3.fillGas(Math.random() * 100);

        car1.powerOn();
        car2.powerOn();
        car3.powerOn();

        double distance = Math.random() * 100;
        car1.move(distance);
        car2.move(distance);
        car3.move(distance);
        System.out.println(distance);

        if (car1.comparePerformance(car2) > 0 && car1.comparePerformance(car3) > 0) {

            System.out.println("car 1 won");

        } else if (car2.comparePerformance(car1) > 0 && car2.comparePerformance(car3) > 0) {

            System.out.println("car 2 won");

        } else {

            System.out.println("car 3 won");

        }
    }


}
