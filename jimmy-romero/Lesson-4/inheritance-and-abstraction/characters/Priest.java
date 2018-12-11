package characters;

import interfaces.IHeal;

public class Priest extends Character implements IHeal {
  public Priest() {
    super(125, 200, 100);
  }

  @Override
  public void attack(Character target) {
    target.setHealth(target.getHealth() - getDamage());
    setHealth((int) (getHealth() + (getDamage() * 0.1)));
    if (target.getHealth() > 0) {
      target.setHealth((int) (target.getHealth() - (getDamage() * 0.1)));
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