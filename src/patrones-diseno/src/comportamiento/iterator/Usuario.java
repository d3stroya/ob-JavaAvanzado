public class Usuario {
    // ATRIBUTOS
    private String nombre;
    private int edad;

    // CONSTRUCTORES
    private Usuario() {}

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
