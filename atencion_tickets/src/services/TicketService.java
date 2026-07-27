package services;

import java.util.LinkedList;
import java.util.Queue;

import models.SupportTicket;

public class TicketService {
    private final Queue<SupportTicket> tickets;
    public TicketService(){
        tickets = new LinkedList<>();
    }

    public boolean registerTicket(SupportTicket t){
        return tickets.offer(t);
    }

    public SupportTicket nexTicket(){
        return tickets.peek();
    }

    public SupportTicket attendTicket(){
        return tickets.poll();
    }

    public int pendingTicket(){
        return tickets.size();
    }

    public void processAllTickets(){
        while (!tickets.isEmpty()) {
            SupportTicket t = tickets.poll();
            System.out.println("Atendiendo "+ t);
        }

    }

    public void showAllTickets(){
        tickets.forEach(t-> System.out.println(t));
    }
}
