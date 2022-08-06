package excepciones;

import java.util.ArrayList;

/**
 * Clase que gestiona la excepción
 */
public class Users {
    ArrayList<String> users = new ArrayList();

    public boolean addUsers(String name) throws UsersException {
        for(String user : users) {
            if(user == name) {
                throw new UsersRegisteredException(name);
            }
        }
        users.add(name);
        return true;
    }

}
