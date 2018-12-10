package rpc;

import characters.Character;
import characters.Mages;
import characters.Priests;
import characters.Warriors;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public  static void main(String [] arg){
        List<Character> characters = new ArrayList<>();
        Character mages1 = new Mages(100, 300, 75);
        Character mages2 = new Mages(100, 300, 75);
        Character mages3 = new Mages(100, 300, 75);
        characters.add(mages1);
        characters.add(mages2);
        characters.add(mages3);

        Character warrior1 = new Warriors(300, 0, 120);
        Character warrior2 = new Warriors(300, 0, 120);
        Character warrior3 = new Warriors(300, 0, 120);
        characters.add(warrior1);
        characters.add(warrior2);
        characters.add(warrior3);

        Character priest1 = new Priests(125, 200, 100);
        Character priest2 = new Priests(125, 200, 100);
        Character priest3 = new Priests(125, 200, 100);
        characters.add(priest1);
        characters.add(priest2);
        characters.add(priest3);

        while (characters.size() > 1){
            int indexCharacter1 = (int) ((Math.random()*(characters.size())));
            int indexCharacter2 = (int) ((Math.random()*(characters.size())));
            Character character = characters.get(indexCharacter1);
            Character character1 = characters.get(indexCharacter2);
            healsCharacter(character1);
            attackCharacter(character, character1);
            removeCharacter(characters, indexCharacter2, character1);
        }

        for (Character character: characters) {
            System.out.println(character.getClass().getName());
            System.out.println(character.getHealth());
        }
    }

    private static void healsCharacter(Character character) {
        if(character.getHealth() <= 0 && character.getMana() > 0){
            Priests priests = new Priests();
            priests.heal(character);
        }
    }

    private static void removeCharacter(List<Character> characters, int indexCharacter, Character character) {
        if(character.getHealth() <= 0){
            characters.remove(indexCharacter);
        }
    }

    private static void attackCharacter(Character character, Character character1) {
        if(character instanceof Priests){
            if(character.getHealth() <= 50 && character.getMana() > 0){
                ((Priests) character).heal(character);
            }else {
                character.attack(character1);
            }
        }else {
            character.attack(character1);
        }
    }
}
