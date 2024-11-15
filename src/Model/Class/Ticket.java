package Model.Class;

import Model.Enum.TicketType;

public class Ticket {

    TicketType ticketType;
    double tiketPrice;
    String ticketNumber;

    public Ticket(TicketType ticketType, double tiketPrice, String ticketNumber) {
        this.ticketType = ticketType;
        this.tiketPrice = tiketPrice;
        this.ticketNumber = ticketNumber;
    }

    public TicketType getTicketType() {
        return ticketType;
    }
    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }
    public double getTiketPrice() {
        return tiketPrice;
    }
    public void setTiketPrice(double tiketPrice) {
        this.tiketPrice = tiketPrice;
    }
    public String getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

}
