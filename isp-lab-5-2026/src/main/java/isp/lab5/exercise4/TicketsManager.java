package isp.lab5.exercise4;

public class TicketsManager {
    public Tickets generateTicket(double price){
        Tickets tickets=new Tickets(price, TicketStatus.NEW);
        System.out.println("Tickets generated");
        return tickets;
    }
    public boolean validateTicket(Tickets tickets){
        if(tickets.getStatus()==TicketStatus.PAID){
            System.out.println("Ticket is valid");
            return true;
        }
        if(tickets.getStatus()==TicketStatus.USED){
            System.out.println("Ticket already used");
            return false;
        }
        System.out.println("Ticket is not paid");
        return false;
    }
}
