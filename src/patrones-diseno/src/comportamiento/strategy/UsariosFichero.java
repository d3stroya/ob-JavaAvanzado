import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsariosFichero implements Usuarios {
    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;

    public void UsuariosFichero() {
        try {
            fichero = new PrintStream(ficheroUsuarios);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void crear(String nombre) {
        fichero.println(nombre);
    }

    @Override
    public ArrayList<String> listar() {
        ArrayList<String> usuarios = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new Scanner(new File(ficheroUsuarios)));
            while(scanner.hasNext()) {
                usuarios.add(scanner.next());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return usuarios;
    }

}
