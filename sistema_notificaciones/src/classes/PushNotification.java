package classes;

import enums.NotificationType;

/**
 * Record que representa una notificacion push enviada a un dispositivo.
 *
 * Este record almacena el token del dispositivo y el mensaje que se desea
 * enviar. Al ser un record, sus datos son inmutables y Java genera
 * automaticamente metodos como equals(), hashCode() y toString().
 *
 * El token del dispositivo sirve para identificar a donde se enviara la
 * notificacion, por eso se valida que no sea nulo ni este vacio.
 *
 * @param deviceToken token del dispositivo que recibira la notificacion
 * @param message contenido del mensaje push
 *
 * @author DexenRoss
 */
public record PushNotification(String deviceToken, String message) implements Notification {

    /**
     * Constructor compacto encargado de validar los datos antes de crear
     * la notificacion push.
     *
     * Valida que el token del dispositivo no sea nulo ni este vacio. Tambien
     * valida que el mensaje no sea nulo ni este vacio.
     *
     * @throws IllegalArgumentException si el token del dispositivo esta vacio
     *                                  o si el mensaje esta vacio
     */
    public PushNotification {
        if (deviceToken == null || deviceToken.isBlank()) {
            throw new IllegalArgumentException("El token del dispositivo no puede estar vacio");
        }

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacio");
        }
    }

    /**
     * Regresa el tipo de notificacion correspondiente a Push.
     *
     * @return NotificationType.PUSH
     */
    @Override
    public NotificationType type() {
        return NotificationType.PUSH;
    }
}
