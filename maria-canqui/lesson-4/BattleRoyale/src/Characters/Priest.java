package Characters;

import Actions.Heal;

public class Priest extends GameCharacter implements Heal {

    public Priest(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    @Override
    public void attack(GameCharacter character) {
        int mana = this.getMana() - 30;
        if (mana >= 0) {
            this.setMana(mana);
            int health = character.getHealth() - (this.getDamage());
            character.setHealth(health);
        }
    }

    @Override
    public void heal(GameCharacter target) {
        int mana = getMana() - 30;
        if (mana >= 0) {
            this.setMana(mana);
            int health = target.getHealth() + 100;
            target.setHealth(health);
        }
    }
}