package characters;

public class Mage extends Character {

  public Mage() {
    super(100, 300, 75);
  }

  @Override
  public void attack(Character targetCharacter) {
    if (getMana() > 0) {
      setMana(getMana() - 100);
      targetCharacter.setHealth(targetCharacter.getHealth() - (getDamage() * 2));
    }
  }
}