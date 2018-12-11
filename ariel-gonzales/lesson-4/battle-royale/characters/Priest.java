package characters;

import interfaces.IHeal;

public class Priest extends Character implements IHeal {


    public Priest() {
        super(125, 200, 100);
    }

    @Override
    public void attack(Character character) {
        if (this.health <= 50) {
            this.heal(this);
        } else {
            character.setHealth(character.getHealth() - 100);
            this.health += this.damage / 10;
            this.mana -= 100;
        }
    }

    @Override
    public void heal(Character character) {
        character.setHealth(character.getHealth() + 150);
        this.mana -= 100;
    }
}
