import model.Customer;
import services.CustomerService;

public class App {
    public static void main(String[] args){
        CustomerService service= new CustomerService();
        service.registerCustomer(new Customer("C001","Emilio Caballero","test@gmail.com"));
        service.registerCustomer(new Customer("C002","Mariana Pacheco","mar@gmail.com"));
        service.registerCustomer(new Customer("C003","Liz Tovar","liz@gmail.com"));
        System.out.println("=======CLIENTES=======");
        service.showCustomers();
        System.out.println("=======BUSCAR CLIENTE=======");
        System.out.println(service.findCustomer("C001"));
        System.out.println("=======ACTUALIZAR EMAIL=======");
        System.out.println("Actualizo correo: "+service.updateEmailCustomer("C001", "dexengod@gmail.com"));
        System.out.println("=======CLIENTES=======");
        service.showCustomers();
        System.out.println("=======EXISTE C001=======");
        System.out.println(service.exitCustomer("C001"));

        System.out.println("=======TOTAL CLIENTES=======");
        System.out.println(service.totalCustomers());

    }
}
