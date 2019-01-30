import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
  private File mFile = new File("D:\\Minions_repository\\dev-fundamentals-g\\jimmy-romero\\Lesson-3\\guess-the-movie\\movies.txt");

  private int numberOfMoviesInFile() {
    Scanner scannedFile = null;
    int accumulator = 0;
    try {
      scannedFile = new Scanner(mFile);
    } catch (FileNotFoundException e) {
      System.out.println("File is missing!");
    }
    if (scannedFile != null) {
      while (scannedFile.hasNextLine()) {
        scannedFile.nextLine();
        accumulator++;
      }
    }
    return accumulator;
  }

  private int generateRandomNumber() {
    int limit = numberOfMoviesInFile();
    return (int) (Math.random() * (limit));
  }

  public String randomlyPickMovie() {
    List<String> currentMovie = new ArrayList<>();
    Scanner scannedMovie = null;
    String pickedMovie = null;

    try {
      scannedMovie = new Scanner(mFile);
    } catch (FileNotFoundException e) {
      System.out.println("File is missing!");
    }

    if (scannedMovie != null) {
      while (scannedMovie.hasNextLine()) {
        currentMovie.add(scannedMovie.nextLine());
      }

      int randomNumber = generateRandomNumber();
      for (int iterator = 0; iterator < currentMovie.size(); iterator++) {
        if (iterator == randomNumber) {
          pickedMovie = currentMovie.get(iterator);
          break;
        }
      }
    }
    return pickedMovie;
  }
}
