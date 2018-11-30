package homework_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Util {
    public static  ArrayList<Double> readCarsGas() throws FileNotFoundException {
        ArrayList<Double> arrayValuesList = new ArrayList<>();
        File file = new File("src/homework_1/inputs.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            arrayValuesList.add(Double.parseDouble(line));
        }
        return arrayValuesList;
    }
}
