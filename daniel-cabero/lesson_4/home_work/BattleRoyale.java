package lesson_4.home_work;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Cabero
 * @since 09/12/2018.
 */
public class BattleRoyale {

    public static void main(String[] args) {
        List<Character> team1 = new ArrayList<>();
        List<Character> team2 = new ArrayList<>();

        for (int aux = 0; aux < 10; aux++) {
            int heal = (int) (Math.random() * 100);
            if (aux < 3) {
                team1.add(new Warrior("Warrior1" + aux, 20 + aux * 2, heal));
                team2.add(new Priest("Priest2" + aux, 20 + aux * 3, heal));
            }
            if (aux < 6 && aux >= 3) {
                team2.add(new Warrior("Warrior1" + aux, 20 + aux * 3, heal));
                team1.add(new Priest("Priest2" + aux, 20 + aux * 2, heal));
            }
            if ((aux < 10 && aux >= 6)) {
                team2.add(new Mage("Mage1" + aux, 20 + aux * 3, heal));
                team1.add(new Mage("Mage2" + aux, 20 + aux * 2, heal));
            }
        }

        for (Character person : team1) {
            int ramdon = (int) (Math.random() * 9);
            team2.get(ramdon).heal -= person.attack();
            if (team2.get(ramdon).heal<0){
                team2.get(ramdon).name = "dead";
                team2.get(ramdon).heal = 0;
            }
        }
        for (Character person : team2) {
            int ramdon = (int) (Math.random() *9);
            team1.get(ramdon).heal -= person.attack();
            if (team1.get(ramdon).heal<0){
                team1.get(ramdon).name = "dead";
                team1.get(ramdon).heal = 0;
            }
        }

        for (int res = 0 ; res<10 ; res++) {
            System.out.println("Character :"+ team1.get(res).name+" has heal :" + team1.get(res).heal);
            System.out.println("Character :"+ team2.get(res).name+" has heal :" + team2.get(res).heal);
        }
    }
}
