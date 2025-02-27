package booking;

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
        movieTicketServer.bookTickets(name, tickets);
    }
}