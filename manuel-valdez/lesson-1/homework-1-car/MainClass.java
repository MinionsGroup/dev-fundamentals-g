package lesson_1.exercise_1_contacts.homework_1_car;

public class MainClass {
    public static void main(String[] args) {
		DataLoader data = new DataLoader();
		double distance = data.carDistance();
		Car celica = new Car(100, distance);

		distance = data.carDistance();
		Car mustang = new Car(200, distance);

		distance = data.carDistance();
		Car golf = new Car(150, distance);

		celica.powerOn();
		mustang.powerOn();
		golf.powerOn();

		System.out.println("Celica car is powered on?: " + celica.isPowerOn());
		System.out.println("Mustang car is powered on?: " + mustang.isPowerOn());
		System.out.println("Golf car is powered on?: " + golf.isPowerOn());

		int amountOfGas = data.LoadGas();

		celica.fillGas(amountOfGas);
		mustang.fillGas(amountOfGas);
		golf.fillGas(amountOfGas);

		int distanceToMove = Integer.parseInt(args[0]);
		celica.move(distanceToMove);
		mustang.move(distanceToMove);
		golf.move(distanceToMove);

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
