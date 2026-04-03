package isp.lab5.exercise4;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Tickets> tickets;

    public User(String name){
        this.name=name;
        this.tickets=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Tickets> getTickets() {
        return tickets;
    }
    public void addTicket(Tickets ticket){
        tickets.add(ticket);
    }
    @Override
    public String toString(){
        return "User= \n" +
                "name= " + name +
                ", tickets= " + tickets;
    }
}
