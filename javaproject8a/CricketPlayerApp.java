import java.util.Scanner;

class CricketPlayer extends Thread {

    String playerName;
    String country;
    int matches;
    int runs;
    int wickets;

    CricketPlayer(String playerName, String country, int matches, int runs, int wickets) {

        this.playerName = playerName;
        this.country = country;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;

    }

    public void run() {

        System.out.println("\n--- Cricket Player Information ---");

        System.out.println("Player Name: " + playerName);
        System.out.println("Country: " + country);
        System.out.println("Matches: " + matches);
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);

        System.out.println("\nPlayer Statistics:");

        for (int i = 1; i <= matches; i++) {

            System.out.println("Match " + i + ": Player played");

            if (i == 5) {
                break;
            }
        }

        System.out.println("\nPlayer information displayed!");

    }

}

public class CricketPlayerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Country: ");
        String country = sc.nextLine();

        System.out.print("Enter Number of Matches: ");
        int matches = sc.nextInt();

        System.out.print("Enter Runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter Wickets: ");
        int wickets = sc.nextInt();

        CricketPlayer p1 = new CricketPlayer(
            name, country, matches, runs, wickets
        );

        p1.start();

        sc.close();
    }
}