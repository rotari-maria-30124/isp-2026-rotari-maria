package isp.lab5.exercise4;

public class OrganizerApp {
    private TicketsManager ticketsManager;

    public OrganizerApp(TicketsManager ticketsManager){
        this.ticketsManager=ticketsManager;
    }

    public void checkIn(Tickets tickets){
        if(ticketsManager.validateTicket(tickets)){
            tickets.setStatus(TicketStatus.USED);
            System.out.println("Check-in successful");
        }
        else {
            System.out.println("Check-in failed");
        }
    }
}
