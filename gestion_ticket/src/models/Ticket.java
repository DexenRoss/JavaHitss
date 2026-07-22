package models;

import enums.Priority;

public record Ticket(Long id, String title, Priority priority) {
    
}
