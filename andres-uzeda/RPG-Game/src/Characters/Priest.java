package Characters;

public class Priest extends Character {
    public Priest(){
        super.health = 125;
        super.damage = 100;
        super.mana = 200;
    }
    @Override
    public void attackACharacter(Object object) {
        Character character = (Character)object;
        character.health -= this.damage;
    }
}
