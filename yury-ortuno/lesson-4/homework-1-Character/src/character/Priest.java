package character;

import interfaces.Heal;

public class Priest extends Character implements Heal {

    public Priest() {
        super(125, 200, 100);
    }


    @Override
    public void heal(Character targetCharacter) {
        if (mana >= 100) {
            targetCharacter.health += 150;
        }
    }

    @Override
    public void attack(Character targetCharacter) {
        targetCharacter.health -= damage;
        health = (int) (health + damage * 0.1);
    }
}
