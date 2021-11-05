package day04;

public class Passanger {
    private String name;
    private String ticketId;
    private int packages;

    public Passanger(String name, String ticketId, int packages) {
        this.name = name;
        this.ticketId = ticketId;
        this.packages = packages;
    }

    public String getName() {
        return name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getPackages() {
        return packages;
    }
}
