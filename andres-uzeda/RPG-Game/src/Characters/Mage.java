package Characters;

public class Mage extends Character {
    public Mage(){
        super.health = 100;
        super.damage = 75;
        super.mana = 300;
    }
    @Override
    public void attackACharacter(Object object) {
        Character character = (Character)object;
        character.health -= this.damage;
    }
}
