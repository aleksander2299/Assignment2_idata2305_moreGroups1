package booking;

/**
 * Client class to book tickets for a movie
 */
public class MovieTicketClient implements Runnable{

    private MovieTicketServer movieTicketServer;
    private String name;
    private int tickets;

    public MovieTicketClient(MovieTicketServer movieTicketServer, String name, int tickets) {
        this.movieTicketServer = movieTicketServer;
        this.name = name;
        this.tickets = tickets;
    }

    public void start() {

        movieTicketServer.bookTickets(name, tickets);
    }

    @Override
    public void run() {
        System.out.println(this.name + "i ordered " + tickets);
        movieTicketServer.bookTickets(name, tickets);

    }
}