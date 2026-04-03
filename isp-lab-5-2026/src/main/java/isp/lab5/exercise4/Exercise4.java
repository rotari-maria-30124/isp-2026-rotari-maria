package isp.lab5.exercise4;


public class Exercise4 {
    public static void main(String[] args){
        User user=new User("Noelia");
        Organizer organizer=new Organizer("Alex");
        TicketsManager ticketsManager=new TicketsManager();
        PaymentGateway paymentGateway=new PaymentGateway();
        UserApp userApp=new UserApp(ticketsManager, paymentGateway);
        OrganizerApp organizerApp=new OrganizerApp(ticketsManager);
        System.out.println(user);
        userApp.buyTicket(user, 60);
        userApp.viewTicket(user);
        System.out.println(user);
        System.out.println(organizer);
        if(!user.getTickets().isEmpty()){
            Tickets tickets=user.getTickets().get(0);
            organizerApp.checkIn(tickets);
            System.out.println(tickets);
        }
    }
}
