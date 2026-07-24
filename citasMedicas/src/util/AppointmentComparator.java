package util;

import java.util.Comparator;

import models.Appointment;

public class AppointmentComparator implements Comparator<Appointment> {

    @Override
    public int compare(Appointment arg0, Appointment arg1) {
        int res = arg0.date().compareTo(arg1.date());
        if (res!=0) {
            return res;
        }
        return arg0.name().compareToIgnoreCase(arg1.name());
    }

}
