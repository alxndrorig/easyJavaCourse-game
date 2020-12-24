public class Player {
    public String name;
    public int level;
    public String playerClass;

    public Player(String name, int level, String playerClass) {
        this.name = name;
        this.level = level;
        this.playerClass = playerClass;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String playerClass) {
        this.name = name;
        this.playerClass = playerClass;
    }

    public void playerInfo (){
        System.out.println("Player info: " + this.name + " " + this.level + " " + this.playerClass);
    }
}
    