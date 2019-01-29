package space_challenge;

public class Rocket implements SpaceShip {
    int cost;
    int weigth;
    int maxWeigth;
    int weigthCarried;

    @Override
    public boolean launch() {
        return false;
    }

    @Override
    public boolean land() {
        return false;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public void carry(Item item) {

    }
}
