package space_challenge;

public class U2 extends Rocket {
    public U2() {
        super.cost = 120000000;
        super.weigth = 18000;
        super.maxWeigth = 29000;
        super.weigthCarried = 0;
    }

    @Override
    public boolean launch() {
        double chance = 0.04 * (weigthCarried / maxWeigth);
        if(chance == 0.04)
        {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean land() {
        double chance = 0.08 * (weigthCarried / maxWeigth);
        if(chance == 0.08)
        {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean canCarry(Item item) {
        int weigthToCharge = weigthCarried + item.getWeight();
        if(weigthToCharge < maxWeigth){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void carry(Item item) {
            weigthCarried += weigthCarried + item.getWeight();
    }
}
