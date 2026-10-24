import java.util.Scanner;

interface Batting {
    void showRuns();
}

interface Bowling {
    void showWickets();
}

class CricketPlayer implements Batting, Bowling {

    String name;
    String team;
    int matches;
    int runs;
    int wickets;

    CricketPlayer(String name, String team, int matches, int runs, int wickets) {
        this.name = name;
        this.team = team;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
    }

    void display() {
        System.out.println("\nPlayer Details");
        System.out.println("Player Name : " + name);
        System.out.println("Team        : " + team);
        System.out.println("Matches     : " + matches);
    }

    public void showRuns() {
        System.out.println("Runs        : " + runs);
    }

    public void showWickets() {
        System.out.println("Wickets     : " + wickets);
    }
}

public class InterfaceMultipleInheritance {

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

        CricketPlayer player =
            new CricketPlayer(name, team, matches, runs, wickets);

        player.display();
        player.showRuns();
        player.showWickets();

        sc.close();
    }
}