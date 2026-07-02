package enums;

public enum UserRole {
    ADMIN, EMPLOYEE, CLIENT;

    public boolean isAdmin(){
        return this == ADMIN;
    }
}
