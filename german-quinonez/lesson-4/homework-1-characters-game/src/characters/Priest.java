package characters;

import interfaces.IHeal;

public class Priest extends Character implements IHeal {

    public Priest() {
        super(125, 200, 100);
    }

    @Override
    public void attack(Character character) {
        if (character.getHealth() <= 50 && character.getMana() >= 100) {
            heal(this);
        } else {
            character.setHealth(character.getHealth() - this.getDamage());
            this.setHealth(this.getHealth() + (this.getDamage() / 10));
            character.setHealth(character.getHealth() - this.getDamage() / 10);
        }

    }

    @Override
    public void heal(Character character) {
        if (character.getMana() > 0) {
            character.setMana(character.getMana() - 100);
            character.setHealth(character.getHealth() + 150);
        }
    }
}
