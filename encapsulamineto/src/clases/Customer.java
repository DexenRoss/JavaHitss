package clases;

public class Customer {
    private static int id =0;
    private String name;
    private String email;


    public Customer(String name, String email) {
        this.id++;
        this.name = name;
        this.email = email;
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

    public void showInformation(){
        System.out.println("ID: %d\tNombre: %s\tEmail: %s".formatted(id,name,email));
    }

    

    

    
}
