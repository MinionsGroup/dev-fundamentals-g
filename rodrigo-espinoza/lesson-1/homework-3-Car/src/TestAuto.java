public class TestAuto {
    public static void main(String args[]) {

        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        Auto auto3 = new Auto();

        auto1.setCapacity(40);
        auto2.setCapacity(30);
        auto3.setCapacity(20);


        auto1.setGasConsume(9);
        auto2.setGasConsume(8);
        auto3.setGasConsume(10);

        auto1.fillGas(16);
        auto2.fillGas(15);
        auto3.fillGas(12);

        auto1.powerOn();
        auto2.powerOn();
        auto3.powerOn();

        auto1.move(20);
        auto2.move(20);
        auto3.move(20);

        if (auto1.distanceTraveled() < auto2.distanceTraveled()) {
            if(auto2.distanceTraveled() < auto3.distanceTraveled()){
                System.out.println("Auto 3 won");
            }
            else{
                System.out.println("Auto 2 won");
            }
        } else if (auto1.distanceTraveled() == auto2.distanceTraveled() && auto2.distanceTraveled() == auto3.distanceTraveled()) {
            if (auto1.getGas() < auto2.getGas()) {
                if(auto2.getGas() < auto3.getGas()){
                    System.out.println("Auto 3 won");
                }
                else {
                    System.out.println("Auto 2 won");
                }
            } else if (auto1.getGasConsume() < auto2.getGasConsume()) {
                if(auto2.getGasConsume() < auto3.getGasConsume()){
                    System.out.println("auto 3 won");
                }
                else {
                    System.out.println("Auto 2 won");
                }
            }
            else{
                System.out.println("Auto 1 won");
            }
        } else {
            System.out.println("Auto 1 won");
        }
    }
}

