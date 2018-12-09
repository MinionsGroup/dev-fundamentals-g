
import java.io.File;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) throws Exception {
		File file = new File("trees you want to know.txt");
		Scanner scanner = new Scanner(file);

		int words = 0;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();

			words += line.split(" ").length;
		}

		System.out.println("the file contains: " + words + " words.");
	}
}
