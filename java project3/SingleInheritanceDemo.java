class CricketPlayer {
    String playerName;
    String team;
    int matches;
    int runs;
    int wickets;

    CricketPlayer(String playerName, String team, int matches, int runs, int wickets) {
        this.playerName = playerName;
        this.team = team;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
    }

    void displayPlayer() {
        System.out.println("Player Name : " + playerName);
        System.out.println("Team        : " + team);
        System.out.println("Matches     : " + matches);
    }
}


class BattingPlayer extends CricketPlayer {

    BattingPlayer(String playerName, String team, int matches, int runs, int wickets) {
        super(playerName, team, matches, runs, wickets);
    }

    void displayPerformance() {
        System.out.println("Runs        : " + runs);
        System.out.println("Wickets     : " + wickets);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        BattingPlayer player = new BattingPlayer(
                "Virat Kohli", "India", 300, 14000, 5);

        player.displayPlayer();
        player.displayPerformance();
    }
}