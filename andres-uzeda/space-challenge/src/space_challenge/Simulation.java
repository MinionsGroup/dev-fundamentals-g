package space_challenge;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Simulation {

    public static void main(String [] args) throws FileNotFoundException {
        ArrayList<Item> ListOfItemsPhase1 = Utils.getAlistItem("src/space_challenge/phase-1.txt");
        ArrayList<Item> ListOfItemsPhase2 = Utils.getAlistItem("src/space_challenge/phase-2.txt");
        U1 u1 = new U1();
        U2 u2 = new U2();
        ArrayList<Item> ListOfItemsInU1Phase1 = ItemsLoadedInTheRocket(u1, ListOfItemsPhase1);
        ArrayList<Item> ListOfItemsInU2Phase1 =ItemsLoadedInTheRocket(u2, ListOfItemsPhase1);
        ArrayList<Item> ListOfItemsInU1Phase2 = ItemsLoadedInTheRocket(u1, ListOfItemsPhase2);
        ArrayList<Item> ListOfItemsInU2Phase2 =ItemsLoadedInTheRocket(u2, ListOfItemsPhase2);
        launchARocket(u1);
        launchARocket(u2);
    }

    public static ArrayList<Item> ItemsLoadedInTheRocket(Rocket rocket, ArrayList<Item> listItems){
        ArrayList<Item> ListToReturn = new ArrayList<>();
        if(rocket.getClass().getName() == "U1"){
            for (Item item: listItems
                 ) {
                if((rocket).canCarry(item)){
                    (rocket).carry(item);
                    ListToReturn.add(item);
                }
            }
            return ListToReturn;
        }else {
            for (Item item: listItems
            ) {
                if((rocket).canCarry(item)){
                    (rocket).carry(item);
                    ListToReturn.add(item);
                }
            }
            return ListToReturn;
        }
    }

    public static void launchARocket(Rocket rocket){
        if(rocket.launch() && rocket.land()){
            System.out.println("rocket didn't have problems");
        }else{
            System.out.println("rocket had problems");
        }
    }
}
