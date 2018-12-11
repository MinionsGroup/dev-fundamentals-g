package characters;

import interfaces.IHeal;

public class Priest extends Character implements IHeal {
    public Priest() {
        super(125, 200, 100);
    }
    @Override
    public void attack(Character targetSelected) {
        targetSelected.setHealth(targetSelected.getHealth() - getDamage());
        setHealth((int) (getDamage() + getDamage() * 0.1));
        if (targetSelected.getHealth() > 0) {
            targetSelected.setHealth((int) (targetSelected.getHealth() - (getDamage() * 0.1)));
        }
    }

    @Override
    public void heal(Character characterToHeal, double amountToHeal) {
        if (this.getMana() > 0) {
            this.setMana(this.getMana() - 100);
            this.setHealth(this.getHealth() + 150);
        }
    }
}
