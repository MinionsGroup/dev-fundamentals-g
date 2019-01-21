public class MainCar {
    public static void main(String args[]) {

        double distance = Math.random() * 100;

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setCapacity((Math.random() * 100));
        car2.setCapacity((Math.random() * 100));
        car3.setCapacity((Math.random() * 100));

        car1.loadGas(Math.random() * 100);
        car2.loadGas(Math.random() * 100);
        car3.loadGas(Math.random() * 100);


        car1.setGasConsume(Math.random() * 100);
        car2.setGasConsume(Math.random() * 100);
        car3.setGasConsume(Math.random() * 100);

        car1.powerOn();
        car2.powerOn();
        car3.powerOn();

        car1.move(distance);
        car2.move(distance);
        car3.move(distance);

        if (comparePerformance(car1, car2) && comparePerformance(car1, car3)) {

            System.out.println("car 1 won");

        } else if (comparePerformance(car2, car3) && comparePerformance(car2, car3)) {

            System.out.println("car 2 won");

        } else {

            System.out.println("car 3 won");

        }
    }

    public static boolean comparePerformance(Car car, Car otherCar) {
        return (car.getDistance() > otherCar.getDistance()) ? true :
                (car.getGas() > otherCar.getGas()) ? true :
                        (car.getGasConsume() > otherCar.getGasConsume()) ? true : false;
    }
}
