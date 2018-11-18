package file_word_count;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordCount {

    public static void main(String [] args) throws FileNotFoundException {
        System.out.println("The file has "+ Util.NumberOfWordInAFile("src/file_word_count/file.txt") +" words");
    }
}
