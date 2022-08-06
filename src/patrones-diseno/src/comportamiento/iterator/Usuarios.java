import java.util.ArrayList;
import java.util.LinkedList;

public class Usuarios implements UsusarioIterator {
    // Lista en la que almacenar usuarios
    private static ArrayList<Usuario> usuarios = new ArrayList();

    // Chivato de posición
    private int posicion = 0;

    // Método para iterar
    public static void crear(Usuario usuario) {
        usuarios.add(usuario);
    }



    // Implementa métodos de la interfaz
    @Override
    public Usuario siguiente() {
        // Obtengo el usuario que necesito
        Usuario usuario = this.usuarios.get(posicion);
        // Incremento posicion
        posicion += 1;
        // Devuelvo el usuario
        return usuario;
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }

    @Override
    public boolean hayMas() {
        // Devuelve true si la posición es menor que el tamaño del array
        // Devuelve false si la posición NO es menor que el tamaño del array, es decir,no hay más elementos
        return posicion < usuarios.size();
    }
}
