public class Warrior extends Character {

    public Warrior(String name){
        super(300,0,120,name);
    }
    @Override
    public  void attack(Character target) {
        target.health=target.health-this.damage;
    }
}
