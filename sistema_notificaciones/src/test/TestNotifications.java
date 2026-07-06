package test;

import classes.EmailNotification;
import classes.Notification;
import classes.PushNotification;
import classes.SmsNotification;
import service.NotificationProcessor;


/**
 * Clase principal para probar el sistema de notificaciones empresariales.
 *
 * Aqui se crea un arreglo de tipo Notification[] que contiene diferentes
 * tipos de notificaciones: correo, SMS y push.
 *
 * Despues se manda el arreglo al NotificationProcessor para contar cuantos
 * elementos hay de cada tipo y mostrar el resumen final.
 *
 * @author DexenRoss
 */
public class TestNotifications {

    /**
     * Metodo principal del programa.
     *
     * @param args argumentos de consola
     */
    public static void main(String[] args) {
        /*
        * Aqui tambien se usa el manejo de excepciones.
        *
        * Pero en lugar de dejar que esa excepcion rompa todo el programa, se puede
        * capturar con try-catch, mostrar el error y continuar con las siguientes
        * notificaciones.
        *
        * Asi el programa sigue funcionando y solamente se descartan las
        * notificaciones que no cumplen con las validaciones.
        */
        Notification[] notifications = {
            new EmailNotification("usuario@empresa.com", "Bienvenida", "Gracias por registrarte"),
            new SmsNotification("5512345678", "Tu codigo es 8271"),
            new PushNotification("abc123xyz987", "Tienes una nueva promocion"),

            new EmailNotification("cliente@empresa.com", "Factura", "Tu factura ya esta disponible"),
            new SmsNotification("5598765432", "Tu pedido va en camino"),
            new PushNotification("token987abc123", "Actualizacion disponible"),

            new EmailNotification("soporte@empresa.com", "Ticket", "Tu caso fue atendido"),
            new SmsNotification("5511223344", "Pago recibido"),
            new PushNotification("push000111222", "Sesion iniciada correctamente"),

            new EmailNotification("ventas@empresa.com", "Cotizacion", "La cotizacion fue enviada"),
            new PushNotification("deviceABC123XYZ", "Recordatorio de reunion"),
            new PushNotification("movil555token", "Nueva notificacion empresarial")
        };

        NotificationProcessor processor = new NotificationProcessor();

        processor.process(notifications);
        processor.showSummary(notifications);
    }
}
