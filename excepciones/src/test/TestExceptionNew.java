package test;

import excepciones.InsufficientStockException;

public class TestExceptionNew {
    public static void main(String[] args) {
        String order = null;
        try {
            validOrder(order);
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
        }
        try {
            validStock(3);
            System.out.println("Stock suficiente");
        } catch (InsufficientStockException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ejecucion del programa");
    }

    public static void validStock(int stock) throws InsufficientStockException {
        if (stock < 5) {
            throw new InsufficientStockException("No hay suficiente stock disponible");
        }
    }

    public static void validOrder(String order) throws InvalidOrderException{
        if (order == null) {
            throw new InvalidOrderException("La orden no puede ser nula");
        }
    }

}
