import java.nio.channels.Pipe.SourceChannel;
import java.time.LocalDateTime;

import models.SupportTicket;
import services.TicketService;

public class App {
    public static void main(String[] args){
        TicketService service = new TicketService();

        service.registerTicket(new SupportTicket(1,"Carlos","No inicia sesion",LocalDateTime.now()));
        service.registerTicket(new SupportTicket(2,"Ana","error al pagar",LocalDateTime.now()));
        service.registerTicket(new SupportTicket(3,"Luis","No se genera la factura",LocalDateTime.now()));
        service.registerTicket(new SupportTicket(4,"Pedro","No se tiene internet",LocalDateTime.now()));
        System.out.println("=======ELEMENTOS DE LA COLA=======");
        service.showAllTickets();

        System.out.println("=======PENDIENTES=======");
        System.out.println(service.pendingTicket());
        System.out.println("=======SIGUIENTE TICKET=======");
        System.out.println(service.nexTicket());
        System.out.println("=======ATENDER TICKET=======");
        System.out.println(service.attendTicket());
        System.out.println(service.pendingTicket());
        System.out.println("=======PROCESAR TODOS=======");
        service.processAllTickets();
        System.out.println("=======PENDIENTES=======");
        System.out.println(service.pendingTicket());
        System.out.println("=======ELEMENTOS DE LA COLA=======");
        service.showAllTickets();
    }
}
