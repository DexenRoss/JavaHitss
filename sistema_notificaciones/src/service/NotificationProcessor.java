package service;

import classes.EmailNotification;
import classes.Notification;
import classes.PushNotification;
import classes.SmsNotification;

/**
 * Clase encargada de procesar un arreglo de notificaciones.
 *
 * Esta clase recorre el arreglo Notification[] y cuenta cuantas
 * notificaciones existen de cada tipo.
 *
 * El conteo se realiza usando switch moderno con pattern matching,
 * evitando usar cadenas de if-else o instanceof tradicionales.
 *
 * @author DexenRoss
 */
public class NotificationProcessor {
    private int emailCounter;
    private int smsCounter;
    private int pushCounter;

    /**
     * Procesa el arreglo de notificaciones y aumenta los contadores
     * dependiendo del tipo de cada notificacion.
     *
     * @param notifications arreglo de notificaciones a procesar
     */
    public void process(Notification[] notifications) {
        for (Notification notification : notifications) {
            switch (notification) {
                case EmailNotification email -> emailCounter++;
                case SmsNotification sms -> smsCounter++;
                case PushNotification push -> pushCounter++;
            }
        }
    }

    /**
     * Muestra en consola el resumen final del procesamiento.
     *
     * @param notifications arreglo usado para obtener el total de notificaciones
     */
    public void showSummary(Notification[] notifications) {
        System.out.println("========= RESUMEN =========");
        System.out.println("Correos enviados: " + emailCounter);
        System.out.println("SMS enviados: " + smsCounter);
        System.out.println("Push enviados: " + pushCounter);
        System.out.println("Total: " + notifications.length);
    }
}
