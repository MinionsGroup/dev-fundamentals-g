package RPG;

public class StartTheGame {
    public static void main(String[] args){
        boolean theGameIsEnd = false;
        BattleRoyale.addPlayers();
        while (!theGameIsEnd){
            System.out.println("Start Turns");
            BattleRoyale.startTheAttacks();
            System.out.println("Finish Turns");
            BattleRoyale.quitDeadCharacters();
            theGameIsEnd = BattleRoyale.areThereOneCharacter();
        }
    }
}
