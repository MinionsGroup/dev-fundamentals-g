package space_challenge;

public class U1 extends Rocket {
    public U1() {
        super.cost = 100000000;
        super.weigth = 10000;
        super.maxWeigth = 18000;
        super.weigthCarried = 0;
    }
    @Override
    public boolean launch() {
        double chance = 0.05 * (weigthCarried / maxWeigth);
        if(chance == 0.05)
        {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean land() {
        double chance = 0.1 * (weigthCarried / maxWeigth);
        if(chance == 0.1)
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
