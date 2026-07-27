package model;

import java.time.LocalDateTime;

public record EmergencyCase(Integer id, String name,int priority, LocalDateTime arrivalTime) {
    
}
