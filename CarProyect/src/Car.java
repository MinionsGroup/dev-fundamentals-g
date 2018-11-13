public class Car {
    private double gas;
    private double mileage;
    private boolean powerOn;
    private double performance;

    public Car(final double gas, final double mileage , final double performance) {
        this.gas = gas;
        this.mileage = mileage;
        this.powerOn = powerOn;
        this.performance = mileage / performance;
    }

    public void powerOn() {
        powerOn = true;
    }

    public void powerOff() {
        powerOn = false;
    }

    public void fillGas(final double countGas) {
        gas += countGas;
    }

    public void move(final double distance) {
        System.out.println();
        for (int mileage = 0; mileage < distance * 2; mileage++) {

            if (mileage > (gas * performance)) {
                System.out.print("o^o");
                return;
            }
            System.out.print("_ ");
        }
        System.out.print("o^o");
    }


    public static void main(String[] args) {

        System.out.println("*********Instructions:*********");
        System.out.println(" Each '_' is 0.5 mileage.");
        System.out.println(" 1   2   3   4   5   6   7   8   9  10  11   12   13   14   15   16   17   18   19   20.....KMs");
        Car car01 = new Car(10, 2.5, 1.5);
        car01.powerOn();
        car01.move(10);

        Car car02 = new Car(10, 1.5, 0.5);
        car02.powerOn();
        car02.move(10);

        Car car03 = new Car(10, 1, 1);
        car03.powerOn();
        car03.move(10);
    }


}
