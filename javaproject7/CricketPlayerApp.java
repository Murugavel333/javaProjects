import java.util.Scanner;

class InvalidRunsException extends Exception {

    InvalidRunsException(String message) {
        super(message);
    }
}

public class CricketPlayerApp {

    static void checkRuns(int runs) throws InvalidRunsException {

        if (runs < 0) {
            throw new InvalidRunsException("Runs cannot be negative!");
        }

        System.out.println("Valid Runs: " + runs);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Runs: ");
        int runs = sc.nextInt();

        try {

            checkRuns(runs);

            System.out.println("Player Name: " + name);
            System.out.println("Runs: " + runs);

        } catch (InvalidRunsException e) {

            System.out.println("Exception: " + e.getMessage());

        }

        sc.close();
    }
}