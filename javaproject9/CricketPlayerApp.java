import java.util.Scanner;

class CricketPlayer implements Runnable {

    String playerName;
    String country;
    int matches;
    int runs;
    int wickets;

    CricketPlayer(String playerName, String country,
                  int matches, int runs, int wickets) {

        this.playerName = playerName;
        this.country = country;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
    }

    synchronized void displayPlayer() {

        System.out.println("\n--- Cricket Player Details ---");
        System.out.println("Player Name: " + playerName);
        System.out.println("Country: " + country);
        System.out.println("Number of Matches: " + matches);
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);

        System.out.println("\nMatch Details:");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Match: " + i);
        }

        System.out.println("Player Information Displayed!");
    }

    public void run() {

        synchronized (this) {

            System.out.println("Player thread is waiting...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            displayPlayer();
        }
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

        CricketPlayer p =
            new CricketPlayer(name, country, matches, runs, wickets);

        Thread t1 = new Thread(p);

        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        synchronized (p) {

            System.out.println("\nMain thread is notifying...");

            p.notify();
            p.notifyAll();
        }

        sc.close();
    }
}