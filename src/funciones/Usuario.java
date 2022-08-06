package funciones;

// 6. Usar clase como parámetro en el constructor
public class Usuario {
    public String nombre;
    public String apellidos;
    public int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

}
