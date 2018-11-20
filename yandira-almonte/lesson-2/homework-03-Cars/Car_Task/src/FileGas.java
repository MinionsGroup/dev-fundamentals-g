import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileGas {
	
	private String path;
	private double gas;

	public FileGas(String path) {
		this.path = path;
		readGas();
	}
	
	public FileGas(){
		this.path="gas_file.txt";
		readGas();
	}
	
	private void readGas(){
		gas = 0.0;
		File file =new File(this.path);
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			String line = scanner.nextLine();
			gas = Double.valueOf(line);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file doesn't exist");
			
		} catch (Exception e){
			System.out.println("File doesn't have the data expected");
		}

	}
	
	public double getGas(){
		return this.gas;
	}

}
