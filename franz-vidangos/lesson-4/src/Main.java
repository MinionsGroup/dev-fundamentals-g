import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        ArrayList<Character>  playersList= new ArrayList();

        Mage mage1 = new Mage("mage-1");
        Warrior warrior1 = new Warrior("warrior-1");
        Priest priest1 = new Priest("priest-1");
        Mage mage2 = new Mage("mage-2");
        Warrior warrior2 = new Warrior("warrior-2");
        Priest priest2 = new Priest("priest-2");
        Mage mage3 = new Mage("mage-3");
        Warrior warrior3 = new Warrior("warrior-3");
        Priest priest3 = new Priest("priest-3");
        Mage mage4 = new Mage("mage-4");


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
        while(playersList.size()>=2){
            pla= (int) (Math.random()*playersList.size());
            int tar=pla;
            while(tar==pla){tar= (int) (Math.random()*playersList.size());}
            System.out.println(playersList.get(pla).name+" attack to "+playersList.get(tar).name);
            playersList.get(pla).attack(playersList.get(tar));
            if(playersList.get(tar).health<=0){
                System.out.println(playersList.get(tar).name+" was defeated");
                playersList.remove(tar);
            }
        }
        System.out.println(playersList.get(0).name+" is the winner!");
    }

}