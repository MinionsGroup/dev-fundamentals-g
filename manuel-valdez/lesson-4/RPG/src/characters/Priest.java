package characters;

import interfaces.IHeal;

public class Priest extends Character implements IHeal {
    public Priest() {
        super(125, 200, 100);
    }

    @Override
    public void attack(Character characterUnderAttack) {
        characterUnderAttack.setHealth(characterUnderAttack.getHealth() - damage);
        heal(this, damage * 0.1);
    }

    public void heal(Character characterToHeal, double amountToHeal) {
        mana -= 100;
        characterToHeal.setHealth(characterToHeal.getHealth() + amountToHeal);
    }
}
