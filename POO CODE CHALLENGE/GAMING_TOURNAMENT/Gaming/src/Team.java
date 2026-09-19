
import java.util.*;

public class Team {

    private String name;
    private ArrayList<Players> players = new ArrayList<Players>();

    //constructor
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void registerPlayer(Players player) {
        players.add(player);
    }

    public int getTotalPoints() {
        int totalPoints = 0;
        for (Players player : players) {
            totalPoints += player.getScore();
        }
        return totalPoints;
    }

    public void showInformation() {
        System.out.println("TEAM: " + getName());
        for (Players player : players) {
            player.showInformation();
        }
        System.out.println("Players:" + Players.totalPlayers());
        System.out.println("Total Points: " + getTotalPoints());
        System.out.println("------------------------------");
    }

}
