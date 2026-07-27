import java.time.LocalDateTime;

import model.EmergencyCase;
import service.EmergencyService;

public class App {
    public static void main(String[] args){
        EmergencyService service = new EmergencyService();
        service.registerCase(new EmergencyCase(1,"Juan",5,LocalDateTime.of(2026,7,28,10, 0)));
    }
}
