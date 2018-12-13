import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        ArrayList<Character>  playersList= new ArrayList();

        Mage mage1 = new Mage();
        Warrior warrior1 = new Warrior();
        Priest priest1 = new Priest();
        Mage mage2 = new Mage();
        Warrior warrior2 = new Warrior();
        Priest priest2 = new Priest();
        Mage mage3 = new Mage();
        Warrior warrior3 = new Warrior();
        Priest priest3 = new Priest();
        Mage mage4 = new Mage();


        playersList.add(mage1);
        playersList.add(warrior1);
        playersList.add(priest1);
        playersList.add(mage2);
        playersList.add(warrior2);
        playersList.add(priest2);
        playersList.add(mage3);
        playersList.add(warrior3);
        playersList.add(priest3);
        playersList.add(mage4);

        //BattleRoyale
        int pla=0;
        int tar=0;
        while(playersList.size()>=2){
            pla= (int) (Math.random()*playersList.size());
            tar= (int) (Math.random()*playersList.size());
            playersList.get(pla).attack(playersList.get(tar));
            if(playersList.get(tar).health<=0){playersList.remove(tar);}
        }
        //System.out.println(playersList);
    }

}