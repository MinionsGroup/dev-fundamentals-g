package characters;

public class Mage extends Character {

    public Mage() {
        super(100, 300, 75
        );
    }

    @Override
    public void attack(Character character) {
        if (this.getMana() > 0) {
            this.setMana(this.getMana() - 100);
            character.setHealth(character.getHealth() - (2 * this.getDamage()));
        }
    }
}
