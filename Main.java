import booking.MovieTicketServer;
import booking.MovieTicketClient;

/**
 * Main class to test the MovieTicketServer and MovieTicketClient classes
 */
public class Main {
    public synchronized static void main(String[] args) throws InterruptedException {
        MovieTicketServer movieTicketServer = new MovieTicketServer(
                "Troll",
                10
        );

        // Creating 4 threads
        Thread t1 = new Thread(new MovieTicketClient(movieTicketServer, "Xiangming", 3));
        Thread t2 = new Thread(new MovieTicketClient(movieTicketServer, "Ilaria", 2));
        Thread t3 = new Thread(new MovieTicketClient(movieTicketServer, "Sam", 3));
        Thread t4 = new Thread(new MovieTicketClient(movieTicketServer, "Andreas", 4));

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    }
