package services;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import models.Ticket;

public class ManagerTicket {
    private final List<Ticket> tickets;

    public ManagerTicket() {
        this.tickets = new LinkedList<>();
    }

    public void addFirstTicket(Ticket t){
        tickets.addFirst(t);
    }

    public void addLastTicket(Ticket t){
        tickets.addLast(t);
    }

    public Ticket getFirstTicket(){
        return tickets.getFirst();
    }

    public Ticket getLasTicket(){
        return tickets.getLast();
    }

    public Ticket removeFirstTicket(){
        return tickets.removeFirst();
    }

    public Ticket removeLasTicket(){
        return tickets.removeLast();
    }

    public void insterTicket(int index, Ticket t){
        tickets.add(index, t);
    }

    public void printForwardTickets(){
        ListIterator<Ticket> iterator = tickets.listIterator();
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            System.out.println(ticket);
        }
    }

    public void printBackwardTicket(){
        ListIterator<Ticket> iterator = tickets.listIterator(tickets.size());
        while (iterator.hasPrevious()) {
            Ticket ticket = iterator.previous();
            System.out.println(ticket);
        }
    }

    public int sizeTicket(){
        return tickets.size();
    }

    
}
