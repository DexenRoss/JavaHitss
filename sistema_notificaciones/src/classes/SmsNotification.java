package classes;

import enums.NotificationType;

/**
 * Record que representa una notificacion enviada por SMS.
 *
 * Este record almacena el numero telefonico del destinatario y el mensaje que
 * se desea enviar. Al ser un record, sus datos son inmutables y Java genera
 * automaticamente metodos como equals(), hashCode() y toString().
 *
 * El numero telefonico se maneja como String para poder validar facilmente
 * que contenga exactamente 10 digitos numericos.
 *
 * @param phoneNumber numero telefonico del destinatario
 * @param message contenido del mensaje SMS
 *
 * @author DexenRoss
 */
public record SmsNotification(String phoneNumber, String message) implements Notification {

    /**
     * Constructor compacto encargado de validar los datos antes de crear
     * la notificacion SMS.
     *
     * Valida que el numero telefonico no sea nulo y que contenga exactamente
     * 10 digitos numericos. Tambien valida que el mensaje no sea nulo ni este
     * vacio.
     *
     * @throws IllegalArgumentException si el telefono no tiene exactamente
     *                                  10 digitos numericos o si el mensaje
     *                                  esta vacio
     */
    public SmsNotification {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("El telefono debe tener exactamente 10 digitos");
        }

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacio");
        }
    }

    /**
     * Regresa el tipo de notificacion correspondiente a SMS.
     *
     * @return NotificationType.SMS
     */
    @Override
    public NotificationType type() {
        return NotificationType.SMS;
    }
}
