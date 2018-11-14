
public class vehicle {
    /*variable-propierties of class */
    private double gasOil;
    private double kilometers;
    private boolean powerOn;
    private double cilinder;

    public vehicle(final double gasOil, final double kilometers , final double cilinder) {
        this.gasOil = gasOil;
        this.kilometers = kilometers;
        this.powerOn = powerOn;
        this.cilinder = kilometers / cilinder;
    }

    public void powerOn() {
        powerOn = true;
    }

    public void powerOff() {
        powerOn = false;
    }

    public void fillGas(final double countGas) {
        gasOil += countGas;
    }

    public void move(final double distance) {
        System.out.println();
        for (int mileage = 0; mileage < distance * 2; mileage++) {

            if (mileage > (gasOil *cilinder)) {
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
        vehicle car01startlet1300cc = new vehicle(1.3, 5.38, 1.3);
        car01startlet1300cc.powerOn();
        car01startlet1300cc.move(20);

    }


    public double getGasOil() {
        return gasOil;
    }

    public void setGasOil(double gasOil) {
        this.gasOil = gasOil;
    }
}
