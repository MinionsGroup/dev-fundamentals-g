public class Priest extends Character implements IHeal{

    public Priest(String name){
        super(125,200,100,name);
    }

    @Override
    public  void attack(Character target) {
        if(checkMana(this.mana)) {
            if (this.health >= this.health / 2) {
                target.health = target.health - this.damage;
                this.health = this.health + this.damage / 10;
            } else {
                heal(this);
                System.out.println(this.name+" heals himself");
            }
        }
        else{
            target.health = target.health - this.damage;
            System.out.println(this.name+" not mana");
        }
    }

   @Override
    public void heal(Character target) {
        target.health=target.health+150;
        this.mana=this.mana-100;
    }
}
