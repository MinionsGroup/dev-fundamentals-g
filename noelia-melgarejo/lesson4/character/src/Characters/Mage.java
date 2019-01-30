package Characters;

public class Mage extends Character {
    public Mage(){
        super(100,75,300);
    }

    @Override
    public void Attack(Character other) {
        if(health>0){
            this.mana = this.mana - 100;
            other.health = other.health - (this.damage*2);
        }
    }
}
