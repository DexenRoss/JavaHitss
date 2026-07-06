package classes;

import enums.NotificationType;

/**
 * Interfaz base para representar cualquier tipo de notificacion del sistema.
 *
 * Al ser una sealed interface, solamente permite que ciertos records la
 * implementen. En este caso, las unicas notificaciones validas son:
 * EmailNotification, SmsNotification y PushNotification.
 *
 * Esto ayuda a que el switch moderno pueda conocer todos los casos posibles.
 *
 * @author DexenRoss
 */
public sealed interface Notification permits EmailNotification, SmsNotification, PushNotification {
    /**
     * Regresa el mensaje principal de la notificacion.
     *
     * @return mensaje de la notificacion
     */
    String message();

    /**
     * Regresa el tipo de notificacion.
     *
     * @return tipo de notificacion segun el enum NotificationType
     */
    NotificationType type();
}
