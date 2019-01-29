package Characters;

import Interfaces.IHeal;

public class Priest extends Character implements IHeal {
    public Priest(String name){
        super.health = 125;
        super.damage = 100;
        super.mana = 200;
        super.name = name;
    }
    @Override
    public void attackACharacter(Object object) {
        Character character = (Character)object;
        character.health -= this.damage;
    }

    @Override
    public void healACharacter() {
        super.health += 100;
        super.mana -= 50;
    }
}
