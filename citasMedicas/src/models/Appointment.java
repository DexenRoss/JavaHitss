package models;

import java.time.LocalDateTime;

public record Appointment(LocalDateTime date, String name, String doctor) {
    
}
