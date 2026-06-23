package clases;

public class Customer {
    private static int id =0;
    private String name;
    private String email;


    

    public Customer(String name, String email) {
        this.id++;
        updateName(name);
        updateEmail(email);
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void updateName(String name){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public void showInformation(){
        System.out.println("ID: %d\tNombre: %s\tEmail: %s".formatted(id,name,email));
    }

    public void updateEmail(String email){
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Aa-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.email = email;
    }

    

    

    
}
