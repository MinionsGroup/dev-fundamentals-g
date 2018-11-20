
class Main {
    public static void main (String [] args) {
        CarsManager carsManager = new CarsManager();
        
        ReadFile info = new ReadFile();

        Car car1 = new Car(info.readDistance() , info.readGas(), 100, 1);
        Car car2 = new Car(info.readDistance(), info.readGas(), 100, 2);
        Car car3 = new Car(info.readDistance(), info.readGas(), 50, 2);

        carsManager.addCar(car1);
        carsManager.addCar(car2);
        carsManager.addCar(car3);

        carsManager.initTests();

    }
}
