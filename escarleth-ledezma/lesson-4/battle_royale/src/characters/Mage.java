package characters;

public class Mage extends Character {
    public Mage() {
        super(100, 300, 75);
    }

    @Override
    public void attack(Character characterToAttack) {
        mana = mana - 100;
        characterToAttack.setHealth(characterToAttack.getHealth() - (getDamage() * 2));
    }
}
