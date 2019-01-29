package RPG;

import Characters.*;
import Characters.Character;

import java.util.ArrayList;
import java.util.Collections;


public class BattleRoyale {
    public static ArrayList<Character> Characters = new ArrayList<Character>();
    public static void addPlayers(){
        Character warrior1 = new Warrior("warrior 1");
        Character warrior2 = new Warrior("warrior 2");
        Character warrior3 = new Warrior("warrior 3");
        Character warrior4 = new Warrior("warrior 4");
        Character priest1 = new Priest("priest 1");
        Character priest2 = new Priest("priest 2");
        Character priest3 = new Priest("priest 3");
        Character mage1 = new Mage("mage 1");
        Character mage2 = new Mage("mage 2");
        Character mage3 = new Mage("mage 3");
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
        for(int playerTurn: listOfTurns){
            System.out.println(playerTurn);
            boolean attack = true;
            int target = 100;
            while (attack){
                int number = Utils.getRandomNumberInRange(0,listOfTurns.size()-1);
                if(number != playerTurn){
                    System.out.println("atk");
                    System.out.println(number);
                    target = number;
                    attack = false;
                }
            }
            Characters.get(playerTurn).attackACharacter(Characters.get(target));
            mageAtkDouble(Characters.get(playerTurn).getClass().getName(), playerTurn, target);
            priestHealChain(Characters.get(playerTurn).getClass().getName(), playerTurn);
        }
    }

    public static void mageAtkDouble(String className, int playerTurn, int target){
        if(className == "Characters.Mage"){

            if(Characters.get(playerTurn).getMana()  > 100){
                System.out.println("Doble ATK");
                Characters.get(playerTurn).attackACharacter(Characters.get(target));
                Characters.get(playerTurn).setMana(Characters.get(playerTurn).getMana() - 100);
            }
        }
    }

    public static void priestHealChain(String className, int playerTurn){
        if(className == "Characters.Priest" && Characters.get(playerTurn).getMana() > 100){
            System.out.println("He healed himself");
            ((Priest) Characters.get(playerTurn)).healACharacter();
        }
    }

    public static boolean areThereOneCharacter(){
        if(Characters.size() == 1 || Characters.size() == 0){
            if(Characters.size() == 0){
                System.out.println("Draw Game");
                return true;
            }else {
                System.out.println("The winner is: "+Characters.get(0).getName());
                return true;
            }
        }else{
            return false;
        }
    }


}
