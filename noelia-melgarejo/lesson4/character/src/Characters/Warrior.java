package Characters;

public class Warrior extends Character {
    public Warrior(){
        super(300,120,0);
    }

    @Override
    public void Attack(Character other) {
        if(health>0){
            other.health = other.health - this.damage;
        }
        else{

        }

    }
}
