package RPG;

import characters.Character;
import characters.Mage;
import characters.Priest;
import characters.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleRoyale {
    private List<Character> characters;

    public BattleRoyale() {
        this.characters = new ArrayList<>();
        this.start();
    }

    public void start() {
        this.generateList();
        this.startBattle();
        this.showResults();
    }

    private void showResults() {
        characters.forEach(character -> System.out.println("WINNER: " + character.getClass().getName()));
    }

    private void startBattle() {
        while (characters.size() > 1) {
            int indexOfAttacker = (int) ((Math.random() * (characters.size())));
            int indexOfTarget = (int) ((Math.random() * (characters.size())));
            Character attacker = characters.get(indexOfAttacker);
            Character target = characters.get(indexOfTarget);
            this.showBattle(attacker, target);
            this.attack(attacker, target);
            this.removeFallingCharacters();
        }
    }

    private void removeFallingCharacters() {
        characters.removeIf(character -> character.getHealth() <= 0);
    }

    private void attack(Character attacker, Character target) {
        if (attacker instanceof Priest) {
            ((Priest) attacker).heal();
        } else {
            attacker.attack(target);
        }
    }

    private void showBattle(Character characterA, Character characterB) {
        System.out.println("------ BATTLE ------");
        System.out.println("------ Character Name/Health/Mana  ------");
        System.out.println(characterA.getClass().getName() + " - " + characterA.getHealth() + " - " + characterA.getMana());
        System.out.println("VS");
        System.out.println(characterB.getClass().getName() + " - " + characterB.getHealth() + " - " + characterB.getMana());
    }

    private void generateList() {
        Character character1 = new Mage(500, 500, 120);
        Character character2 = new Mage(500, 500, 120);
        Character character3 = new Mage(500, 500, 120);
        Character character4 = new Warrior(800, 0, 50);
        Character character5 = new Warrior(800, 0, 50);
        Character character6 = new Warrior(800, 0, 50);
        Character character7 = new Priest(700, 800, 45);
        Character character8 = new Priest(700, 800, 45);
        Character character9 = new Priest(700, 800, 45);
        Character character10 = new Priest(700, 800, 45);

        characters.add(character1);
        characters.add(character2);
        characters.add(character3);
        characters.add(character4);
        characters.add(character5);
        characters.add(character6);
        characters.add(character7);
        characters.add(character8);
        characters.add(character9);
        characters.add(character10);
    }

}
