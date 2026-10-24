class CricketPlayer {

    String playerName;
    int runs;

    static String team = "India";

    CricketPlayer(String name, int r) {
        playerName = name;
        runs = r;
    }

    void show() {
        System.out.println("Player Name : " + playerName);
    }

    void show(int matches) {
        System.out.println("Matches : " + matches);
    }

    static void displayTeam() {
        System.out.println("Team : " + team);
    }
}

public class CricketPlayerInfo {
    public static void main(String[] args) {

        CricketPlayer p1 = new CricketPlayer("Virat Kohli", 14000);

       
        p1.show();
        p1.show(300);

        CricketPlayer.displayTeam();
    }
}