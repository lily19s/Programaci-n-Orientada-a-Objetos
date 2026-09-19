
public class Players {

    private static int ID = 1000;
    private final int identifier;
    private static final int TOTAL = 1000;

    private String name;
    private int score;

    //constructor
    public Players(String name, int score) {

        ID++;
        this.identifier = ID;
        this.name = name;
        this.score = score;
    }

    //getters
    public static int getID() {
        return ID;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    //methods and functions
    public void showInformation() {
        System.out.println( getIdentifier() + " - " + getName() + " - " + getScore());
        
        System.out.println("------------------------------");
    }

    public static int totalPlayers() {
        return ID - TOTAL;
    }

}
