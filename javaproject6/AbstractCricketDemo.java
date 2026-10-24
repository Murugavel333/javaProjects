import java.util.Scanner;

abstract class CricketPlayer {
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

    abstract void display();
}

class Player extends CricketPlayer {

    Player(String name, String team, int matches, int runs, int wickets) {
        super(name, team, matches, runs, wickets);
    }

    void display() {
        System.out.println("\nPlayer Details");
        System.out.println("Player Name : " + name);
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


public class AbstractCricketDemo {

    static void showPlayer(Player p) {
        p.display();
    }

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

        Player p1 = new Player(name, team, matches, runs, wickets);

        showPlayer(p1);

        sc.close();
    }
}