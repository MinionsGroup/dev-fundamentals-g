import Characters.GameCharacter;
import Characters.Mage;
import Characters.Priest;
import Characters.Warrior;

import java.util.ArrayList;
import java.util.List;

public class BattleRoyale {

    private List<GameCharacter> gameCharacter;

    public BattleRoyale() {
        this.gameCharacter = new ArrayList<>();
        this.start();
    }

    public void start() {
        this.addCharacters();
        this.startBattle();
    }

    private void startBattle() {
        while (gameCharacter.size() > 1) {
            int indexA = (int) ((Math.random() * (gameCharacter.size())));
            int indexB = (int) ((Math.random() * (gameCharacter.size())));
            GameCharacter characterA = gameCharacter.get(indexA);
            GameCharacter characterB = gameCharacter.get(indexB);

            System.out.println("**************** BATTLE ROYALE ********************");
            System.out.println("Character A: "+ characterA.getClass().getName());
            System.out.println("- Healt: "+ characterA.getHealth());
            System.out.println("- Mana: "+ characterA.getMana());
            System.out.println("- Damage: "+ characterA.getDamage());
            System.out.println("Character B: "+ characterB.getClass().getName());
            System.out.println("- Healt: "+ characterB.getHealth());
            System.out.println("- Mana: "+ characterB.getMana());
            System.out.println("- Damage: "+ characterB.getDamage());
            System.out.println("******************* START BATTLE *******************");

            this.attack(characterA, characterB);
            this.removeGameCharacters(characterA, characterB);
        }

    }
    private void removeGameCharacters(GameCharacter characterA, GameCharacter characterB) {
        if (characterA.getHealth() > characterB.getHealth()) {
            gameCharacter.remove(characterA);
            System.out.println("WINNER: " + characterA.getClass().getName());
        } else {
            gameCharacter.remove(characterB);
            System.out.println("WINNER: " + characterB.getClass().getName());
        }
    }
    private void attack(GameCharacter characterA, GameCharacter characterB) {
        characterA.attack(characterB);
        characterB.attack(characterA);

        if (characterA instanceof Priest) {
            ((Priest) characterA).heal(characterA);
        } else if (characterB instanceof Priest) {
            ((Priest) characterB).heal(characterB);
        }
    }

    private void addCharacters() {
        gameCharacter.add(new Mage(450, 800, 200));
        gameCharacter.add(new Mage(500, 700, 150));
        gameCharacter.add(new Mage(550, 850, 160));
        gameCharacter.add(new Warrior(900, 0, 150));
        gameCharacter.add(new Warrior(950, 0, 100));
        gameCharacter.add(new Warrior(800, 0, 150));
        gameCharacter.add(new Priest(650, 500, 105));
        gameCharacter.add(new Priest(550, 600, 145));
        gameCharacter.add(new Priest(500, 450, 100));
    }
}
