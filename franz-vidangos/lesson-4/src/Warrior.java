public class Warrior extends Character {

    public Warrior(){
        super(300,0,120);
    }
    @Override
    public  void attack(Character target) {
        target.health=target.health-this.damage;
    }
}
