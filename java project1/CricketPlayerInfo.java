class CricketPlayer {
    String playerName;
    String team;
    int matches;
    int runs;
    int wickets;

    CricketPlayer() {
        playerName = "Virat Kohli";
        team = "India";
        matches = 300;
        runs = 14000;
        wickets = 5;
    }

    CricketPlayer(String name, String t, int m, int r, int w) {
        playerName = name;
        team = t;
        matches = m;
        runs = r;
        wickets = w;
    }

    void display() {
        System.out.println("Player Name : " + playerName);
        System.out.println("Team        : " + team);
        System.out.println("Matches     : " + matches);
        System.out.println("Runs        : " + runs);
        System.out.println("Wickets     : " + wickets);
    }
}

public class CricketPlayerInfo {
    public static void main(String[] args) {

        
        CricketPlayer p1 = new CricketPlayer();

        CricketPlayer p2 = new CricketPlayer("Rohit Sharma", "India", 280, 11000, 10);

        System.out.println("Player 1 Details");
        p1.display();

        System.out.println("\nPlayer 2 Details");
        p2.display();
    }
}