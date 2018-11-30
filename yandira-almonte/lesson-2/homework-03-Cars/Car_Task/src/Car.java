
public class Car {

	private double tank;
	private double distance;
	private boolean isPowerOn;
	private double gas_consume;
	private double tankCapacity;

	public Car(double maxGas, double gas_consume) {
		// maximum level of the tank
		this.tankCapacity = maxGas;
		// how many meters the car can advance for every liter of gas
		this.gas_consume = gas_consume;
				
		tank = 0;
		distance = 0;
		isPowerOn = false;
	}

	public void fillGas(double gas) {
		if (this.tank + gas <= tankCapacity)
			this.tank += gas;
		else {
			this.tank = tankCapacity;
			System.out.println(
					"It's not possible to fill that value. Filling the tank to its maximum level");
		}

	}

	private void powerOn() {
		isPowerOn = true;
	}

	private void powerOff() {
		isPowerOn = false;
	}

	private void canMove(double distance) {
		if (tank > 0)
			powerOn();
		else
			powerOff();

	}

	private double getMaxDistanceToMove() {
		return tank * gas_consume;
	}

	private double getGasConsumed(double distance) {
		return distance / gas_consume;
	}

	public void move(double distance) {
		double maxDistance = getMaxDistanceToMove();
		canMove(distance);
		if (isPowerOn) {
			if (distance <= maxDistance) {
				this.distance += distance;
				this.tank -= getGasConsumed(distance);
			} else {
				this.distance += maxDistance;
				this.tank -= getGasConsumed(maxDistance);
			}

		} else {
			this.distance = 0;
		}

	}

	public void showStatus(String carNumber) {
		System.out.println(carNumber + " :");
		System.out.println("\t has moved " + this.distance + " distance.");
		System.out.println("\t Gas level is " + this.tank);
	}
}
