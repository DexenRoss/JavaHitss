package enums;

public enum Priority {
    LOW("Low Priority"),
    MEDIUM("Medium Priority"),
    HIGH("High Priority");

    private final String description;

    private Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
