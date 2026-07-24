package services;

import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.TreeSet;

import models.Appointment;
import util.AppointmentComparator;

public class AppointmentService {
    private final NavigableSet<Appointment> appointments;

    public AppointmentService(){
        this.appointments = new TreeSet<>(new AppointmentComparator());
    }

    public boolean register(Appointment ap){
        return appointments.add(ap);
    }

    public void showAppointments(){
        if (appointments.isEmpty()) {
            System.out.println("No hay citas");
            return;
        }
        System.out.println("=============CITAS================");
        appointments.forEach(p->System.out.println(p));
    }

    public Appointment firsAppointment(){
        if (!appointments.isEmpty()) {
            return appointments.first();
        }
        return null;
        
    }

    public Appointment lasAppointment(){
        return appointments.last();
    }

    public Appointment nexAppointment(LocalDateTime dateTime){
        Appointment appointment = new Appointment(dateTime,null,null);
        return appointments.higher(appointment);
    }

    public NavigableSet<Appointment> appointmentBetween(LocalDateTime start,LocalDateTime end){
        Appointment fromAppointment = new Appointment(start,"","");
        Appointment tAppointment = new Appointment(end,Character.toString(Character.MAX_VALUE),"");
        return appointments.subSet(fromAppointment, true, tAppointment, true);
    }
}
