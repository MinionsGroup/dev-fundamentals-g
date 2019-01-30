import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class guess {

    private String path;
    private ArrayList list= new ArrayList<>();
    private Scanner scanner;
    private String underscores;
    private char[] sel;

    public guess(String path) {
        this.path = path;
        readMovies();
    }

    private void readMovies() {
        File file = new File(this.path);
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Scanner delimiter = new Scanner(line);
                delimiter.useDelimiter("\\s*,\\s*");
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist");
        }
    }

    public String selectRandom() {
        int RandomNumber = (int) (Math.random() * this.list.size());
        String movieTittle = this.list.get(RandomNumber).toString();
        return movieTittle;
    }

    private void hideTittle(String movieTittle) {
        this.underscores = movieTittle.replaceAll("[\\dA-Za-z]", "_");
        this.sel = underscores.toCharArray();
    }

    public void startGame(String movieTittle){
        scanner = new Scanner(System.in);
        hideTittle(movieTittle);
        char guessChar;
        int pos;
        int wrong=0;

        StringBuilder wrongLetter = new StringBuilder();

        while(wrong<10) {
            System.out.println("You are guessing: "+underscores);
            System.out.println("You have guessed ("+wrong+") wrong letters: "+wrongLetter);
            System.out.println("Guess a letter");
            guessChar = scanner.next().charAt(0);
            pos=movieTittle.indexOf(guessChar);
            if(pos == -1) {
                wrong++;
                wrongLetter.append(guessChar);
                wrongLetter.append(" ");
            }

            while (pos != -1) {
                sel[pos] = guessChar;
                pos = movieTittle.indexOf(guessChar, pos + 1);
            }
            underscores = String.valueOf(sel);

            if(underscores.indexOf("_") == -1) {
                wrong = wrong + 10;
                System.out.println("You win!");
                System.out.println("You have guessed '"+underscores+"' correctly");
            }
        }


    }

}
