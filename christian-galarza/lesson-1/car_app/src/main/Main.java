package main;

public class Main {
    public static void main(String[] args) {
        //create the car with tank capacity and performance.
        Car chariot = new Car(0,0);
        Car f1mercedes = new Car(100, 0.1);
        Car f1ferrari = new Car(100, 0.15);
        Car f1mclaren = new Car(105, 0.23);
        Car nissanterrano = new Car(300,0.9);
        //insert the quality of gas and power on the car.
        f1mercedes.fillGas(100);
        f1ferrari.fillGas(100);
        f1mclaren.fillGas(100);
        nissanterrano.fillGas(300);
        chariot.powerOff();
        f1mercedes.powerOn();
        f1ferrari.powerOn();
        f1mclaren.powerOn();
        nissanterrano.powerOn();

        //Print results.
        System.out.println("-- chariot --");
        chariot.moveDistance(2);
        chariot.printInformation();

        System.out.println("\n -- f1 mercedes --");
        f1mercedes.moveDistance(350);
        f1mercedes.printInformation();

        System.out.println("\n -- f1 ferrari --");
        f1ferrari.moveDistance(350);
        f1ferrari.printInformation();

        System.out.println("\n -- f1 mclaren --");
        f1mclaren.moveDistance(350);
        f1mclaren.printInformation();

        System.out.println("\n -- Nissan Terrano --");
        nissanterrano.moveDistance(300);
        nissanterrano.printInformation();
    }
}
