package RPG;

import Characters.*;
import Characters.Character;

import java.util.ArrayList;
import java.util.Collections;


public class BattleRoyale {
    public static ArrayList<Character> Characters = new ArrayList<Character>();
    public static void main(String[] args){
        Character warrior1 = new Warrior();
        Character warrior2 = new Warrior();
        Character warrior3 = new Warrior();
        Character warrior4 = new Warrior();
        Character priest1 = new Priest();
        Character priest2 = new Priest();
        Character priest3 = new Priest();
        Character mage1 = new Mage();
        Character mage2 = new Mage();
        Character mage3 = new Mage();
        boolean theGameIsEnd = false;
        Characters.add(warrior1);
        Characters.add(warrior2);
        Characters.add(warrior3);
        Characters.add(warrior4);
        Characters.add(priest1);
        Characters.add(priest2);
        Characters.add(priest3);
        Characters.add(mage1);
        Characters.add(mage2);
        Characters.add(mage3);
        while (!theGameIsEnd){
            System.out.println("Start Turns");
            startTheAttacks();
            System.out.println("Finish Turns");
            quitDeadCharacters();
            theGameIsEnd = areThereOneCharacter();
        }
    }
    public static void quitDeadCharacters(){
        for(int index = Characters.size()-1; index >= 0; index--){
            if(Characters.get(index).health() <= 0){
                Characters.remove(index);
            }
        }

    }
    public static int[] AttackTurns(){
        int n = Characters.size();
        int[] arraySequence = new int[n];
        int number =  arraySequence.length;
        for(int i = 0; i < arraySequence.length; i++){
            number -= 1;
            arraySequence[i] = number;
        }
        return arraySequence;
    }

    public static ArrayList<Integer> shuffleAttackTurns(){
        int[] arraySequence = AttackTurns();
        ArrayList<Integer> listOfShufflesAttackTurns = new ArrayList<>();
        for(int number: arraySequence)
        {
            listOfShufflesAttackTurns.add(number);
        }
        Collections.shuffle(listOfShufflesAttackTurns);
        return listOfShufflesAttackTurns;
    }

    public static void startTheAttacks(){
        ArrayList<Integer> listOfTurns = shuffleAttackTurns();
        for(int turn: listOfTurns){
            System.out.println(turn);
            boolean attack = true;
            int target = 100;
            while (attack){
                int number = Utils.getRandomNumberInRange(0,listOfTurns.size()-1);
                if(number != turn){
                    System.out.println("atk");
                    System.out.println(number);
                    target = number;
                    attack = false;
                }
            }
            Characters.get(turn).attackACharacter(Characters.get(target));
        }
    }

    public static boolean areThereOneCharacter(){
        if(Characters.size() == 1 || Characters.size() == 0){
            return true;
        }else{
            return false;
        }
    }


}
