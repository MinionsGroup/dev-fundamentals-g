class Main {
    public static void main (String [] args) {
        CarsManager carsManager = new CarsManager();


        Car car1 = new Car(100.0, 100.0, 100, 1);
        Car car2 = new Car(50, 100, 100, 2);
        Car car3 = new Car(100, 10, 50, 2);

        carsManager.addCar(car1);
        carsManager.addCar(car2);
        carsManager.addCar(car3);

        carsManager.initTests();

    }
}