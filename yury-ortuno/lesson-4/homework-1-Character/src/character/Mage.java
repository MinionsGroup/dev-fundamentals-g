package character;

public class Mage extends Character {

    public Mage() {
        super(100, 300, 75);
    }


    @Override
    public void attack(Character targetCharacter) {
        if (mana >= 100) {
            mana -= 100;
            targetCharacter.health -= 2 * damage;
        }
    }
}
