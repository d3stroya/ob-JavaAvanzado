package funciones;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
// 6. Usar clase como parámetro en el constructor
public class Usuarios {
    private ArrayList<Usuario> usuarios = new ArrayList();

    // 7. Crear excepción personalizada
//    public void agregarUsuario(Usuario usuario) throws UserException {
//        if(usuarios.contains(usuario)) {
//            throw new UserException("El usuario ya existe: " + usuario.nombre);
//        }
//        usuarios.add(usuario);
//    }

    // 7.1. Agregar varios usuarios. Es prácticamente lo mismo que la anterior, así que me quedo con esta (permite incluir uno o más usuarios, por lo que incluye la funcionalidad de la anterior.
    public void agregarUsuarios(Usuario ...usuarios) throws UserException {
        for(Usuario usuario : usuarios) {
            if(this.usuarios.contains(usuario)) {
                throw new UserException(usuario.nombre);
            }
            this.usuarios.add(usuario);
        }
    }
}
