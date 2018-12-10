package characters;

public class Warrior extends Character {
    public Warrior(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    @Override
    public void attack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
    }
}
