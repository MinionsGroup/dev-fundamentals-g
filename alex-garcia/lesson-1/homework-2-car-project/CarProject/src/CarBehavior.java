//https://vehiculos.doncomos.com/calcular-consumo-gasolina

class CarBehavior {
    static class Car {
        String name;
        double fuel_capacity;
        double fuel;
        double maximum_distance_with_full_tank;
        double distance;
        boolean status;
    }

    //Fields:
    private  Car [] automobile;
    private int automobileCount;

    //Constructor;
    CarBehavior(){
        automobile = new Car[3];
        automobileCount = 0;
    }

    // Methods:
    void addCar(Car Car){
        automobile[automobileCount] = Car;
        automobileCount++;
    }

    void powerOn(Car Car){
        if (Car.fuel == 0){
            System.out.println(Car.name +": No fuel, this car can not be turned on");
        }
        else {
            Car.status = true;
            System.out.println(Car.name +": power on");
        }

    }

    void powerOff(Car Car){
        Car.status = false;
        System.out.println(Car.name +": power off");
    }

    void addFuel(Car Car, double fuel){
        if(Car.fuel_capacity < fuel){
            System.out.println(Car.name+": The tank will explode with that volume of fuel");
        }
        else {
            Car.fuel = Car.fuel + fuel;
            if (Car.fuel_capacity < Car.fuel){
                Car.fuel = Car.fuel - fuel;
                System.out.println(Car.name+": The tank will explode with that volume of fuel");
            }
            else {
                System.out.println(Car.name+": Add "+Car.fuel+" liter");
            }

        }
    }

    double moveAutomobile(Car Car, double distance){
        double remaining_distance;
        if (!Car.status){
            System.out.println(Car.name+": You must power on car");
        }
        else if (maxDistanceWithActualFuel(Car) < distance){
            System.out.println(Car.name+": This car can move: " + maxDistanceWithActualFuel(Car) +
                    " km with "+ Car.fuel+" liter");
            System.out.println(Car.name+": This car does not have enough fuel to compete in a "+ distance +" km race");
            powerOff(Car);
        }
        else if (maxDistanceWithActualFuel(Car) >= distance){
            System.out.println(Car.name+": This car can move: " + maxDistanceWithActualFuel(Car) +
                    " km with "+ Car.fuel+" liter");
            remaining_distance = maxDistanceWithActualFuel(Car) - distance;
            Car.distance = distance;
            Car.fuel = liter_per_distance(Car) * remaining_distance;
            System.out.println(Car.name+": This car moved: " + Car.distance + " km then this one has "
                    + Car.fuel + " liters");
            powerOff(Car);

        }
        return Car.fuel;
    }

    double maxDistanceWithActualFuel(Car Car){
        double distance = distance_per_liter(Car) * Car.fuel;
        return distance;
    }

    double distance_per_liter(Car Car){
        double km_per_liter = Car.maximum_distance_with_full_tank/Car.fuel_capacity;
        return km_per_liter;
    }

    double liter_per_distance(Car Car){
        double liter_per_km = Car.fuel_capacity/Car.maximum_distance_with_full_tank;
        return liter_per_km;
    }

    Car searchWin(double distance) {
        double minorFuel, majorFuel;
        String win, loser;
        minorFuel = majorFuel = automobile[0].fuel;
        win = loser = null;
        for (int i=0; i<automobileCount; i++){
            if(automobile[i].fuel > majorFuel && automobile[i].distance == distance){
                majorFuel = automobile[i].fuel;
                win = automobile[i].name;
            }
            if (automobile[i].fuel <= minorFuel && automobile[i].distance == distance) {
                minorFuel = automobile[i].fuel;
                loser = automobile[i].name;
            }
            if (automobile[i].distance == 0){
                System.out.println(automobile[i].name + " did not participate in the race");
            }
        }
        System.out.println("The win is " + win + " with " + majorFuel + " liter");
        System.out.println("The loser is " + loser + " with " + minorFuel + " liter");
        return null;
    }


}
