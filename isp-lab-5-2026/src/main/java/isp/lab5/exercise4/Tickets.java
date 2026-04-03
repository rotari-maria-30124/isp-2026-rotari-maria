package isp.lab5.exercise4;

public class Tickets {
    private double price;
    private TicketStatus status;

    public Tickets(double price, TicketStatus status){
        this.price=price;
        this.status=TicketStatus.NEW;
    }
    public double getPrice() {
        return price;
    }
    public TicketStatus getStatus() {
        return status;
    }
    public void setStatus(TicketStatus status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return "Ticket: \n" +
                "price= " + price +
                ", status= " + status;
    }
}
