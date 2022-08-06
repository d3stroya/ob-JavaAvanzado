package excepciones;

/**
 * Clase que gestiona la excepción cuando un usuario ya está registrado
 * Creamos una jerarquía de excepciones:
 * Exception
 *   UserException
 *      UserRegisteredException
 */
public class UsersRegisteredException extends UsersException{
    public UsersRegisteredException(String message) {
        super("Usuario ya registrado ->" + message);
    }
}
