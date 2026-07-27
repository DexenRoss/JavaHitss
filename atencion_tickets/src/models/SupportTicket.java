package models;

import java.time.LocalDateTime;

public record SupportTicket(Integer id, String customer, String description,LocalDateTime createdAt){
    
}
