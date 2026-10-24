import java.util.Scanner;

class CricketPlayer {
    String playerName;
    String team;
    int matches;
    int runs;
    int wickets;

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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Team: ");
        String team = sc.nextLine();

        System.out.print("Enter Matches: ");
        int matches = sc.nextInt();

        System.out.print("Enter Runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter Wickets: ");
        int wickets = sc.nextInt();

        CricketPlayer p1 = new CricketPlayer(name, team, matches, runs, wickets);

        System.out.println("\nPlayer Details");
        p1.display();

        sc.close();
    }
}