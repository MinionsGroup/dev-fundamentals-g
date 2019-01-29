package characters;

public class Warriors extends Character {

    public Warriors(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    @Override
    public void attack(Character character) {
        character.setHealth(character.getHealth()-getDamage());
    }
}
