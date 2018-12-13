public class Mage extends Character{

    public Mage(){
        super(100,300,75);
    }

    @Override
    public  void attack(Character target) {
        target.health=target.health-2*this.damage;
        this.mana=this.mana-100;
    }

}
