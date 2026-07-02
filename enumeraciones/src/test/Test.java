package test;

import enums.*;

public class Test {
    public static void main(String[] args) {

        System.out.println(OrderStatus.CREATED.name());
        System.out.println(Priority.HIGH.name());
        System.out.println(Priority.HIGH.ordinal());
        System.out.println(Priority.HIGH.getDescription());

        Priority priority = Priority.LOW;

        UserRole userRole = UserRole.ADMIN;
        UserRole role = UserRole.CLIENT;
        System.out.println(userRole.isAdmin());
        System.out.println(role.isAdmin());
        /*int status = OrderStatus.CREATED;
        status = 100;
        System.out.println(status);

        OrderStatus orderStatus = new OrderStatus();*/
    }
}
