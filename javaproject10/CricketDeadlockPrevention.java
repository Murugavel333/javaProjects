class CricketPlayer {

    synchronized void playerDetails(String name) {

        System.out.println(name + " entered Player Details.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(name + " is displaying player information.");
    }

    synchronized void playerStats(String name) {

        System.out.println(name + " entered Player Statistics.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(name + " is displaying player statistics.");
    }
}

class PlayerThread extends Thread {

    CricketPlayer player;
    String name;

    PlayerThread(CricketPlayer player, String name) {

        this.player = player;
        this.name = name;
    }

    public void run() {


        player.playerDetails(name);
        player.playerStats(name);
    }
}

public class CricketDeadlockPrevention {

    public static void main(String[] args) {

        CricketPlayer player = new CricketPlayer();

        PlayerThread t1 =
            new PlayerThread(player, "Virat Kohli");

        PlayerThread t2 =
            new PlayerThread(player, "Rohit Sharma");

        t1.start();
        t2.start();
    }
}