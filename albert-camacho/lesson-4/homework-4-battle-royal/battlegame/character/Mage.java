package battlegame.character;

import battlegame.Character;

public class Mage extends Character {

    public Mage(){
        super(100, 300, 75);
    }

    @Override
    public void attack(Character target) {
        int mana = this.getMana() - 100;

        if (mana >= 0) {
            this.setMana(mana);
            // Mage deals twice his default damage.
            int health = target.getHealth() - (this.getDamage() * 2);
            target.setHealth(health);
        }
    }
}
