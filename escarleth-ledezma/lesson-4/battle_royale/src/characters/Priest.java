package characters;

import interfaces.IHeal;

public class Priest extends Character implements IHeal {
    public Priest() {
        super(125, 200, 100);
    }

    @Override
    public void attack(Character characterToAttack) {
        characterToAttack.setHealth(characterToAttack.getHealth() - getDamage());
        heal(this, getDamage() * 0.1);
    }

    @Override
    public void heal(Character characterToHeal, double amountToHeal) {
        mana = mana - 100;
        characterToHeal.setHealth(characterToHeal.getHealth() + amountToHeal);
    }
}
