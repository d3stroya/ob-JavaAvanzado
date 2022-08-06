package funciones;

// Clase que hereda de Exception y le pasa el mensjae de excepción a su clase superior, en este caso, Usuarios.
public class UserException extends Exception {
    public UserException(String message) {
        super("User exception: " + message);
    }
}
