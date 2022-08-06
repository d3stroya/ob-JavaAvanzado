import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UsuariosMemoria usuarios = new UsuariosMemoria();
//        UsuariosFichero usuarios = new UsuariosMemoria();


        // USUARIOS MEMORIA
//        usuarios.crear("Franky");
//        usuarios.crear("Bridget");
//        usuarios.crear("Tess");


        // USUARIOS FICHERO
//        UsuariosFichero usuarios = new UsuariosFichero();
//        usuarios.crear("Franky");
//        usuarios.crear("Bridget");
//        usuarios.crear("Tess");

        // INTERFAZ USUARIOS
        crear(usuarios, "Franky");
        crear(usuarios, "Bridget");
        crear(usuarios, "Tess");

        for(String usuario : usuarios.listar()) {
            System.out.println(usuario);
        }
    }

    // Crear un envoltorio para usar indistintamente una clase u otra

    public static void crear(Usuarios usuarios, String nombre) {
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}
