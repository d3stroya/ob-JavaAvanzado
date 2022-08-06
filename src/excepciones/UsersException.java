package excepciones;

/**
 * Clase que crea una excepción perosnalizada
 */

public class UsersException extends Exception{
    public UsersException(String message) {
        super("Error al registrar -> " + message);

        for(StackTraceElement elemento : getStackTrace()) {
            System.out.println("Stack trace: " + elemento.getClassName() + " " + elemento.getMethodName());
        }
    }
}
