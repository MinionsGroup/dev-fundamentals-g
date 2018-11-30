import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("resource/movies.txt");
        //List<String> movies = new ArrayList<String>();
        List<Movie> movies = new ArrayList<Movie>();
        try{
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                Movie movie = new Movie();
                movie.setTitle(line);
                movies.add(movie);
            }

        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }
        if(!movies.isEmpty()){
            Random random = new Random();
            int n = random.nextInt(movies.size()-1);
            Scanner s = new Scanner(System.in);
            Movie movieToGues = movies.get(n);
            int count =0;
            List<Character> incorrectCharacter =  new ArrayList<>();

            do{
                System.out.println("Guess a letter:");
                char  letter = s.next().charAt(0);
                if(!movieToGues.isLetterInTitle(letter)){
                    count ++;
                    incorrectCharacter.add(letter);
                    System.out.print("You have guessed (" +count+ ") wrong letters:");
                    for (char c: incorrectCharacter){
                        System.out.print(" " + c );
                    }
                    System.out.println();
                }
                else
                {
                    if(!movieToGues.IsTitleGuessed()){
                        System.out.println("You are quessing: " + movieToGues.getTitleGues());
                    }
                }

            }while (count <10 && !movieToGues.IsTitleGuessed());
            if(count< 10){
                System.out.println("You Win!") ;
                System.out.println("You have guessed: " + movieToGues.getTitleGues() + " correctly") ;
            }
            else
            {
                System.out.println("Game Over :( ") ;
                System.out.println("The correct title is: " + movieToGues.getTitle()) ;
                System.out.println("Number attempts:" + count);
            }

        }

    }
}
