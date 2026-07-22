package test;

import enums.Priority;
import models.Ticket;
import services.ManagerTicket;

public class Test {
    public static void main(String[] args) {
        ManagerTicket manager = new ManagerTicket();
        System.out.println("=============AGREGA AL FINAL===============");
        Ticket ticket = new Ticket(1L,"Error en el login",Priority.HIGH);
        manager.printForwardTickets();
        manager.addLastTicket(ticket);
        manager.addLastTicket(new Ticket(2L,"Error de pago", Priority.CRITICAL));
        manager.addLastTicket(new Ticket(3L,"Problemas de conexion", Priority.MEDIUM));
        manager.printForwardTickets();
        System.out.println("===========AGREGAR AL PRINCIPIO============");
        manager.addFirstTicket(new Ticket(4L,"Servidor caido",Priority.CRITICAL));
        manager.printForwardTickets();
        System.out.println("=============OBTENER EL PRIMER TICKET Y ULTIMO============");
        if (manager.sizeTicket() > 0 ) {
            System.out.println("Primer Ticket: "+manager.getFirstTicket());
        }
        
        System.out.println("Ultimo Ticket: "+manager.getLasTicket());

        System.out.println("===============INSERTAR EN POSICION===============");
        manager.insterTicket(2, new Ticket(5L,"Error en reportes",Priority.CRITICAL));
        manager.printForwardTickets();
        System.out.println("==============RECORRIDO HACIA ATRAS===============");
        manager.printBackwardTicket();
        System.out.println("==============ELIMINA TICKET INICIO Y FINAL================");
        if (manager.sizeTicket()>0) {
            System.out.println("Ultima Ticket se elimina: "+manager.removeLasTicket());
        }
        manager.printForwardTickets();
        if (manager.sizeTicket()>0) {
            System.out.println("Primer Ticket se elimina: "+manager.removeFirstTicket());
        }
        manager.printForwardTickets();
    }
}
