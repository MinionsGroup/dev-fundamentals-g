package space_challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static ArrayList<String> getAlistItemsFromAFile(String path) throws FileNotFoundException {
        ArrayList<String> listOfItems = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            listOfItems.add(line);
        }
        return listOfItems;
    }

    public static ArrayList<Item> getAlistItem(String path) throws FileNotFoundException {
        ArrayList<String> ListItem = Utils.getAlistItemsFromAFile(path);
        ArrayList<space_challenge.Item> ListObjectItem = new ArrayList<>();
        for (String a: ListItem
        ) {
            String[] arrayWords = a.trim().split("=");
            space_challenge.Item itema =new space_challenge.Item(arrayWords[0],Integer.valueOf(arrayWords[1]));
            ListObjectItem.add(itema);
        }
        return ListObjectItem;
    }
}
