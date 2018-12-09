import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String [] args){

        File file = new File("listMovies.txt");
        ArrayList list= new ArrayList<>();
        Scanner scanner;
        try {

            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Scanner delimitar = new Scanner(line);
                delimitar.useDelimiter("\\s*,\\s*");
                list.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //System.out.println(list);

        int  RandomNumber= (int) (Math.random() * list.size()) ;

        String movieTittle=list.get(RandomNumber).toString();;
        String underscores=movieTittle.replaceAll("[\\dA-Za-z]", "_");
        char[] sel=underscores.toCharArray();
        // System.out.println(movieTittle);

        scanner = new Scanner(System.in);
        char guessChar;
        //guessChar = scanner.next().charAt(0);
        //int pos=movieTittle.indexOf(guessChar);
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




