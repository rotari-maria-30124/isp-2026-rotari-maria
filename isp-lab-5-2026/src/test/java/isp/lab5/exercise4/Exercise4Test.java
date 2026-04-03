package isp.lab5.exercise4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {
    @Test
    public void test1Ex4(){
        User user=new User("Noelia");
        Organizer organizer=new Organizer("Alex");
        TicketsManager ticketsManager=new TicketsManager();
        PaymentGateway paymentGateway=new PaymentGateway();
        UserApp userApp=new UserApp(ticketsManager, paymentGateway);
        userApp.buyTicket(user,60);
        assertEquals(1, user.getTickets().size());
        Tickets tickets=user.getTickets().get(0);
        assertEquals(60.0, tickets.getPrice(), 0.1);
        assertEquals(TicketStatus.PAID, tickets.getStatus());
    }
    @Test
    public void test2Ex4(){
        User user=new User("Noelia");
        Organizer organizer=new Organizer("Alex");
        TicketsManager ticketsManager=new TicketsManager();
        PaymentGateway paymentGateway=new PaymentGateway();
        UserApp userApp=new UserApp(ticketsManager, paymentGateway);
        OrganizerApp organizerApp=new OrganizerApp(ticketsManager);
        userApp.buyTicket(user, 60);
        Tickets tickets=user.getTickets().get(0);
        organizerApp.checkIn(tickets);
        assertEquals(TicketStatus.USED, tickets.getStatus());
    }
}
