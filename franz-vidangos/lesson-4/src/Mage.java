public class Mage extends Character{

    public Mage(String name){
        super(100,300,75,name);
    }

    @Override
    public  void attack(Character target) {
        if(checkMana(this.mana)){
            target.health=target.health-2*this.damage;
            this.mana=this.mana-100;
        }
        else{
            target.health=target.health-this.damage;
            System.out.println(this.name+" not mana");
        }
    }

}
