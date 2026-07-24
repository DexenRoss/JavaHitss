import java.time.LocalDateTime;

import models.Appointment;
import services.AppointmentService;

public class App {
    public static void main(String[] args) {
        AppointmentService appointmentService = new AppointmentService();
        appointmentService.register(new Appointment(LocalDateTime.of(2026, 7, 25, 9, 0), "Emilio", "Carlos"));
        appointmentService.register(new Appointment(LocalDateTime.of(2026, 7, 25, 11, 0), "Wicho", "Carlos"));
        appointmentService.register(new Appointment(LocalDateTime.of(2026, 8, 2, 13, 30), "Liz", "Carlos"));
        appointmentService.register(new Appointment(LocalDateTime.of(2026, 9, 28, 9, 0), "Mariana", "Carlos"));
        appointmentService.register(new Appointment(LocalDateTime.of(2026, 7, 27, 14, 30), "Annie", "Carlos"));
        appointmentService.showAppointments();
    }
}
