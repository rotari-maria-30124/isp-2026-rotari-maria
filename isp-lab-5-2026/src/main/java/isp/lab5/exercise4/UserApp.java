package isp.lab5.exercise4;

public class UserApp {
    private TicketsManager ticketsManager;
    private PaymentGateway paymentGateway;

    public UserApp(TicketsManager ticketsManager, PaymentGateway paymentGateway){
        this.ticketsManager=ticketsManager;
        this.paymentGateway=paymentGateway;
    }

    public void buyTicket(User user, double price){
        Tickets tickets=ticketsManager.generateTicket(price);
        boolean paid= paymentGateway.makePayment(price);
        if(paid){
            tickets.setStatus(TicketStatus.PAID);
            user.addTicket(tickets);
            System.out.println("Ticket bought");
        }
    }
    public void viewTicket(User user){
        for(Tickets tickets:user.getTickets()){
            System.out.println(tickets);
        }
    }
}
