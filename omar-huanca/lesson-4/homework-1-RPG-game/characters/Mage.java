package characters;

public class Mage extends Character {
    public Mage(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    @Override
    public void attack(Character character) {
        if (getMana() > 0) {
            setMana(getMana() - 100);
            character.setHealth(character.getHealth() - (getDamage() * 2));
        }
    }
}
