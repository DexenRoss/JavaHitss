import java.nio.channels.Pipe.SourceChannel;
import java.time.LocalDateTime;

import model.EmergencyCase;
import service.EmergencyService;

public class App {
    public static void main(String[] args){
        EmergencyService service = new EmergencyService();
        service.registerCase(new EmergencyCase(1,"Juan",5,LocalDateTime.of(2026,7,28,10, 0)));
        service.registerCase(new EmergencyCase(2,"Pedro",5,LocalDateTime.now()));
        service.registerCase(new EmergencyCase(3,"Liz",2,LocalDateTime.of(2026,8,12,8, 0)));
        service.registerCase(new EmergencyCase(4,"Mar",1,LocalDateTime.of(2026,8,9,13, 30)));
        service.showAllPatients();
        System.out.println("Pendientes: "+service.pendingPatient());
        System.out.println("=======SIGUIENTE=======");
        System.out.println(service.nextPacient());
        System.out.println("=======ATENDIENDO=======");
        System.out.println(service.attendPacient());
        System.out.println("=======PROCESAR TODOS=======");
        service.processAllPatients();
        
        
    }
}
