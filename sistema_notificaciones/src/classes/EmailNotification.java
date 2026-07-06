package classes;

import enums.NotificationType;

/**
 * Record que representa una notificacion enviada por correo electronico.
 *
 * Este record almacena el correo del destinatario, el asunto y el mensaje.
 * Al ser un record, sus datos son inmutables y Java genera automaticamente
 * metodos como equals(), hashCode() y toString().
 *
 * @param email correo electronico del destinatario
 * @param subject asunto del correo
 * @param message contenido del mensaje
 *
 * @author DexenRoss
 */
public record EmailNotification(String email, String subject, String message) implements Notification {

    /**
     * Constructor compacto encargado de validar los datos antes de crear
     * la notificacion.
     *
     * @throws IllegalArgumentException si el correo no tiene formato valido,
     *                                  si el asunto esta vacio o si el mensaje
     *                                  esta vacio
     */
    public EmailNotification {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("El correo electronico no tiene un formato valido");
        }

        if (subject == null || subject.isBlank()) {
            throw new IllegalArgumentException("El asunto no puede estar vacio");
        }

        if (message == null || message.isBlank()) {
            throw new IllegalArgumentException("El mensaje no puede estar vacio");
        }
    }

    /**
     * Regresa el tipo de notificacion.
     *
     * @return NotificationType.EMAIL
     */
    @Override
    public NotificationType type() {
        return NotificationType.EMAIL;
    }
}
