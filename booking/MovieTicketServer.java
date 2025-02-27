package booking;


public class MovieTicketServer {
    private String movieName;
    private volatile int totalTickets;

    public MovieTicketServer(String movieName, int totalTickets) {
        this.movieName = movieName;
        this.totalTickets = totalTickets;
    }

    public void bookTickets(String name, int tickets) {
        if (tickets > totalTickets) {
            System.out.println("Not enough tickets");
        } else {
            totalTickets -= tickets;
            System.out.println("Booked");
        }
    }
}