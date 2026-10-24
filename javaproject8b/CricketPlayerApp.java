import java.util.Scanner;

class CricketPlayer implements Runnable {

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

        System.out.println("Player Name: " + playerName);
        System.out.println("Country: " + country);
        System.out.println("Number of Matches: " + matches);
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);

        System.out.println("Match Details:");

        for (int i = 1; i <= 5; i++) {

            System.out.println("Match: " + i);

        }

        System.out.println("Player Information Displayed!");

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

        CricketPlayer p = new CricketPlayer(name, country, matches, runs, wickets);

        Thread t1 = new Thread(p);

        t1.start();

        sc.close();

    }

}