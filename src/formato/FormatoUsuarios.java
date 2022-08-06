package formato;

import java.util.ArrayList;

public class FormatoUsuarios {
    // Densidad vertical
    ArrayList<String> aUsuarios = new ArrayList();
    private int contador = 0;

    // Separación vertical entre conceptos
    public String obtenerUsuarios() {
        // Distancia vertical: variables juntas
        String variable1;
        String variable2;
        int contador1;
        double valor3;

//        for(String usuario : aUsuarios) {
//            return usuario;
//        }

        return obtenerUsuariosDeBaseDeDatos();
    }

    // Distancia vertical: funciones dependientes cerca
    public String obtenerUsuariosDeBaseDeDatos() {
        return "";
    }

    public void UsuariosAmbitoFicticio() {
        int sumador = 1;

        // Ámbito ficticio
        // Opción 1
        for(;; sumador++)
            ;
        // Opción 2
        for(;; sumador++) {};

        // Opción 3
        for(;; sumador++) {

        };

    }


}
