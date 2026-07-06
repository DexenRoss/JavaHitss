package test;

import enums.DocumentType;
import enums.Operation;
import enums.OrderStatus;
import enums.Priority;
import enums.Season;
import enums.UserRole;


public class Test {
    public static void main(String[] args) {

        System.out.println(OrderStatus.CREATED.name());
        System.out.println(Priority.HIGH.name());
        System.out.println(Priority.HIGH.ordinal());
        System.out.println(Priority.HIGH.getDescription());
        OrderStatus status = OrderStatus.CREATED;
        String message = switch(status){
            case CREATED -> "Order Created";
            case CANCELLED -> "Order Cancelled";
            case PAID -> "Payment received";
        };
        System.out.println(message);

        Priority priority = Priority.LOW;

        UserRole userRole = UserRole.ADMIN;
        UserRole role = UserRole.CLIENT;
        System.out.println(userRole.isAdmin());
        System.out.println(role.isAdmin());

        System.out.println("Total: "+Season.totalSeasons());

        System.out.println("Suma: "+Operation.ADD.apply(4, 6));
        System.out.println("Resta: "+Operation.SUB.apply(50, 23));

        DocumentType.PDF.print();
        System.out.println("CompareTo: "+role.compareTo(UserRole.ADMIN));
        System.out.println("equals(): "+role.equals(Operation.ADD));
        System.out.println("==: "+ (role == UserRole.ADMIN));
        System.out.println(role.toString());
        /*int status = OrderStatus.CREATED;
        status = 100;
        System.out.println(status);

        OrderStatus orderStatus = new OrderStatus();*/
    }
}
