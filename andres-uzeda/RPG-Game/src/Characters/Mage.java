package Characters;

public class Mage extends Character {
    public Mage(String name){
        super.health = 100;
        super.damage = 75;
        super.mana = 300;
        super.name = name;
    }
    public int getMana() {
        return super.mana;
    }
    @Override
    public void attackACharacter(Object object) {
        Character character = (Character)object;
        character.health -= this.damage;
    }
}
