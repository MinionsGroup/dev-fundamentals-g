package lesson_1.exercise_1_contacts.homework_1_car;

public class MainClass {
    public static void main(String[] args) {
        Car celica = new Car(100, 200);
        Car mustang = new Car(200, 150);
        Car golf = new Car(150, 250);
        celica.powerOn();
        mustang.powerOn();
        golf.powerOn();

        System.out.println("Celica car is powered on?: " + celica.isPowerOn());
        System.out.println("Mustang car is powered on?: " + mustang.isPowerOn());
        System.out.println("Golf car is powered on?: " + golf.isPowerOn());

        celica.fillGas(15);
        mustang.fillGas(15);
        golf.fillGas(15);

        celica.move(300);
        mustang.move(300);
        golf.move(300);

        System.out.println("Celica amount of distance moved is: " + celica.getDistanceMoved() + ", and remaining gas amount is: " + celica.getGas());
        System.out.println("Mustang amount of distance moved is: " + mustang.getDistanceMoved() + ", and remaining gas amount is: " + mustang.getGas());
        System.out.println("Golf amount of distance moved is: " + golf.getDistanceMoved() + ", and remaining gas amount is: " + golf.getGas());

        celica.powerOff();
        mustang.powerOff();
        golf.powerOff();

        System.out.println("Celica car is powered on?: " + celica.isPowerOn());
        System.out.println("Mustang car is powered on?: " + mustang.isPowerOn());
        System.out.println("Golf car is powered on?: " + golf.isPowerOn());
    }
}
