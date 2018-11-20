package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class read a file.
 *
 *  @author Jose Christian Galarza Crespo
 *  @version 1.0.
 */
public class ReadFile {
    public double loadGas() {
        File file = new File("gas.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(scanner.nextLine());
    }
}
