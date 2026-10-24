class CricketPlayer {
    String playerName;

    CricketPlayer(String playerName) {
        this.playerName = playerName;
    }

    void displayPlayer() {
        System.out.println("Player Name : " + playerName);
    }
}


class TeamPlayer extends CricketPlayer {
    String team;

    TeamPlayer(String playerName, String team) {
        super(playerName);
        this.team = team;
    }

    void displayTeam() {
        System.out.println("Team        : " + team);
    }
}


class AllRounder extends TeamPlayer {
    int matches;
    int runs;
    int wickets;

    AllRounder(String playerName, String team, int matches, int runs, int wickets) {
        super(playerName, team);
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
    }

    void displayPerformance() {
        System.out.println("Matches     : " + matches);
        System.out.println("Runs        : " + runs);
        System.out.println("Wickets     : " + wickets);
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        AllRounder player = new AllRounder(
                "Hardik Pandya", "India", 150, 2500, 90);

        player.displayPlayer();
        player.displayTeam();
        player.displayPerformance();
    }
}