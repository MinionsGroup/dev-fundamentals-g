package battlegame.character;

import battlegame.Character;
import battlegame.skill.IHeal;

public class Priest extends Character implements IHeal {

    public Priest() {
        super(125, 200, 100);
    }

    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - this.damage);

        // Priest heals himself by restoring the 10%
        int health = getHealth() + (getDamage() / 10);
        setHealth(health);
    }

    @Override
    public void heal(Character target) {
        int mana = getMana() - 100;
        if (mana >= 0) {
            setMana(mana);

            int health = target.getHealth() + 150;
            target.setHealth(health);
        }
    }
}
