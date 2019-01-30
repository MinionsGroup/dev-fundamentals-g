package Characters;

public class Mage extends GameCharacter{

    public Mage(int health, int mana, int damage) {
        super(health, mana, damage);
    }

    @Override
    public void attack(GameCharacter target) {
        int mana = this.getMana() - 30;
        if (mana >= 0) {
            this.setMana(mana);
            int health = target.getHealth() - (this.getDamage() * 2);
            target.setHealth(health);
        }
    }
}
