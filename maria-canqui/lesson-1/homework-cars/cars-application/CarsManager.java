public class CarsManager {
    Car [] car_list;
    int carsCount;
    CarView view;
    /**
     * Construct
     */
    CarsManager() {
        carsCount = 0;
        car_list = new Car[5];
        view = new CarView();
    }

    /**
     * This method add a car to a list
     * @param car is a car Object
     */
    void addCar(Car car) {
        car_list[carsCount] = car;
        carsCount++;
    } 
    /**
     * This method init the cars test
     */
    public void initTests() {

        for(int i = 0; i < carsCount; i++) {
            this.view.displayIni();
            this.view.requestCar(String.valueOf(i));
            int testResult = car_list[i].moveCar();
            if (testResult == 2) {
                car_list[i].chargeGasoline(car_list[i].getMaxGasoline() - car_list[i].getGasoline());
                testResult = car_list[i].moveCar();
            }

            this.view.displayResult(testResult);
        }
    }
}
