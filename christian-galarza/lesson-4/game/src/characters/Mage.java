package characters;

public class Mage extends Character {

    public Mage() {
        super(100, 300, 75);
    }
    @Override
    public void attack(Character targetSelected) {
        if (getMana() > 0) {
            setMana( getMana() - 100);
            targetSelected.setHealth(targetSelected.getHealth() - (getDamage() * 2));
        }

    }
}
