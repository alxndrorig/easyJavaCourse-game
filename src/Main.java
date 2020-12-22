import java.util.Arrays;

public class Main{

    private static void showTypeOfHero(int typeOfHero) {
        switch (typeOfHero)  {
            case 1:
                System.out.println("You have chosen a Warrior Class");
                break;
            case 2:
                System.out.println("You have chosen a Mage Class");
                break;
            case 3:
                System.out.println("You have chosen a Archer Class");
                break;
            case 4:
                System.out.println("You have chosen a Killer Class");
                break;
            case 5:
                System.out.println("You have chosen a Warlock Class");
                break;
            case 6:
                System.out.println("You have chosen a Shaman Class");
                break;
            case 7:
                System.out.println("You have chosen a Paladin Class");
                break;
            case 8:
                System.out.println("You have chosen a Scout Class");
                break;
            case 9:
                System.out.println("You have chosen a Healer Class");
                break;
            case 10:
                System.out.println("You have chosen a Bard Class");
                break;
            default:
                System.out.println("Invalid value");
        }
    }
    private static void showLevelBonus (int heroLvl) {
        if (heroLvl % 5 == 0) {
            System.out.println("You received a bonus for reaching level : " + heroLvl + "!");
        }
    }
    private static void cave(int player1Lvl, int player2Lvl) {
        if ((player1Lvl > 10 && player2Lvl > 10) && (Math.abs(player1Lvl - player2Lvl ) <= 3) && !(player1Lvl==player2Lvl)) {
            System.out.println("The cave is open");
        }
        else {
            System.out.println("The cave is closed");
        }

    }
    private static void caveSecurity (int heroLvl, int caveMin, int caveMax) {
        if ((heroLvl>=10) && (heroLvl<=50)){
            System.out.println("The guard let you into the dungeon");
        }
        else System.out.println("The guard didn't let you into the dungeon");
    }
    private static void levels (){
        int [] levels = new int[10];
        for (int i = 0; i<levels.length; i++){
            levels[i]=i;
            System.out.println(levels[i]);
        }
    }
    private static void reward (){
        int[] rewards = {15, 54, 344, 348};
        int sum = 0;
        for (int reward : rewards){
            sum+=reward;
        }
        System.out.println("Your reward:" + sum + "!");
    }


    public static void main(String[] args) {
        showTypeOfHero(8);
        showLevelBonus(278);
        cave(70, 75);
        caveSecurity(53, 3, 35);
        levels();
    }
}
