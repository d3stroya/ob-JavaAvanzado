/**
 * Encapsulación: creamos atributos privados y definimos getters y setters
 * Las clases deben seguir el principio de responsabilidad única: una clase hace una cosa.
 * También debemos mantener las clases cohesionadas: que todas las clases tengan la misma estructura, que los nombres estén relacionados, que haya una jerarquía... que sea intuitivo.
 */

public class Usuario {
    private String nombre;
    private int edad;
    private String email;
    private long altura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }
}
