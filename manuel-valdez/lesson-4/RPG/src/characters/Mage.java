package characters;

public class Mage extends Character {
    public Mage() {
        super(100, 300, 75);
    }

    @Override
    public void attack(Character characterUnderAttack) {
        mana -= 100;
        characterUnderAttack.setHealth(characterUnderAttack.getHealth() - (damage * 2));
    }
}
