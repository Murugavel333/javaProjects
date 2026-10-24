class PasswordVault implements Runnable {

    @Override
    public void run() {
        System.out.println("Password vault thread is running...");
        System.out.println("Checking encrypted password records...");
    }
}

public class Main {
    public static void main(String[] args) {

        PasswordVault vault = new PasswordVault();

        Thread t = new Thread(vault);

        // Calls the run() method in a separate thread
        t.start();
    }
}
