import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

import java.util.ArrayList;
import java.util.List;


public class BattleRoyale {

    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        // write your code here
        Character char1;
        for(int i=1 ; i<= 10; i++){
            if(i% 3 == 0) //Mage
            {
                char1 = new Mage();
            }
            else {
                if (i % 2 == 0) //Warriors
                {

                }
                else //Priets
                {

                }
            }


        }
    }
}
