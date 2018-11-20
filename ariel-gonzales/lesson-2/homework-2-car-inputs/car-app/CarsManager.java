import java.util.ArrayList;
import java.util.List;

/**
 * CarsManager Class.
 */
public class CarsManager {
    List<Car> carsList = new ArrayList<>();

    /**
     * Add Cars into the list.
     *
     * @param car Any Car object.
     */
    public void addCars(Car car) {
        carsList.add(car);
    }

    /**
     * Verify who is the most efficient car into the list.
     *
     * @return the most efficient car.
     */
    public Car whoIsTheBest() {
        double min = carsList.get(0).getConsumedGas();
        Car bestCar = new Car();
        for (Car c : carsList) {
            if (c.getConsumedGas() <= min & c.getGas() != 0) {
                min = c.getConsumedGas();
                bestCar = c;
            }
        }
        return bestCar;
    }
}
