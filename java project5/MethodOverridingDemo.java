import java.util.Scanner;

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

    
    void display() {
        System.out.println("Player Name : " + playerName);
        System.out.println("Team        : " + team);
        System.out.println("Matches     : " + matches);
        System.out.println("Runs        : " + runs);
        System.out.println("Wickets     : " + wickets);
    }
}


class CricketBatsman extends CricketPlayer {

    CricketBatsman(String playerName, String team, int matches, int runs, int wickets) {
        super(playerName, team, matches, runs, wickets);
    }

    
    @Override
    void display() {
        System.out.println("Batsman Details");
        System.out.println("Player Name : " + playerName);
        System.out.println("Team        : " + team);
        System.out.println("Matches     : " + matches);
        System.out.println("Runs        : " + runs);
        System.out.println("Wickets     : " + wickets);

        if (runs >= 10000)
            System.out.println("Performance : Excellent");
        else
            System.out.println("Performance : Good");
    }
}

public class MethodOverridingDemo {
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

        CricketBatsman player =
            new CricketBatsman(name, team, matches, runs, wickets);

        player.display();

        sc.close();
    }
}