package characters;

import interfaces.IHeal;

public class Priest extends Character implements IHeal {
    public Priest(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    public Priest() {

    }

    @Override
    public void attack(Character character) {
        character.setHealth(character.getHealth() - getDamage());
        setHealth((int) (getHealth() + (getDamage() * 0.1)));
        if (character.getHealth() > 0) {
            character.setHealth((int) (character.getHealth() - (getDamage() * 0.1)));
        }
    }

    @Override
    public void heal() {
        if (this.getMana() > 0) {
            this.setMana(this.getMana() - 100);
            this.setHealth(this.getHealth() + 150);
        }
    }
}
