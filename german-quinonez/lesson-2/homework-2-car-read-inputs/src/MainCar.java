public class MainCar {
    public static void main(String args[]) {

        double distance = (args.length == 0) ? (int) (Math.random() * 100) : Double.parseDouble(args[0]);

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setCapacity(1000);
        car2.setCapacity(1000);
        car3.setCapacity(1000);

        double gas = Number.readDoubleFromFile("gas.txt");

        car1.fillGas(gas);
        car2.fillGas(gas);
        car3.fillGas(gas);

        System.out.println("Input a value for gas consume: ");
        car1.setGasConsume(Number.readDoubleFromKeyboard());
        System.out.println("Input a value for gas consume: ");
        car2.setGasConsume(Number.readDoubleFromKeyboard());
        System.out.println("Input a value for gas consume: ");
        car3.setGasConsume(Number.readDoubleFromKeyboard());


        car1.powerOn();
        car2.powerOn();
        car3.powerOn();

        car1.move(distance);
        car2.move(distance);
        car3.move(distance);

        if (car1.comparePerformance(car2) && car1.comparePerformance(car3)) {

            System.out.println("car 1 won");

        } else if (car2.comparePerformance(car1) && car2.comparePerformance(car3)) {

            System.out.println("car 2 won");

        } else {

            System.out.println("car 3 won");

        }
    }
}
