package characters;

public class Mage extends Character {
    public Mage() {
        super(100, 300, 75);
    }

    @Override
    public void attack(Character character) {
        character.setHealth(character.getHealth() - (2 * this.damage));
        this.mana -= 100;

    }
}
