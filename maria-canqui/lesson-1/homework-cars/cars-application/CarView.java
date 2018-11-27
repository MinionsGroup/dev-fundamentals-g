import java.util.HashMap;

class CarView {
    private static final HashMap<Integer, String> testResult = new HashMap<>();
    static {
        testResult.put(1, "The car Pass the test");
        testResult.put(2, "Please, charge gasoline");
    }

    
    /**
     * This method display a header.
     */
    public void displayIni(){
        System.out.println("-------------------------------------------------------");
        System.out.println("---------------Car Performance Simulation--------------");
        System.out.println("-------------------------------------------------------");
    }

    /**
     * This method print the number of car to test 
     */
    public void requestCar(String carNumber){
        System.out.println("Testing performance to car: "+carNumber);
    }

    /**
     * This method print the number of car to test 
     */
    public void displayResult(int status){
        System.out.println("Testing performance to car: "+testResult.get(status));
    }

}
