public class Priest extends Character implements IHeal{

    public Priest(){
        super(125,200,100);
    }

    @Override
    public  void attack(Character target) {
        if(this.health>=125) {
            target.health = target.health - this.damage;
            this.health = this.health + this.damage / 10;
        }
        else{
            heal(target);

        }
    }

   @Override
    public void heal(Character target) {
        target.health=target.health+150;
        this.mana=this.mana-100;
    }
}
