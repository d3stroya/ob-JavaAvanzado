import java.util.ArrayList;

public class Users {
    private int contador;
                        // 2º principio Deméter
    public void miMetodo(int contador) {
        // 3º principio Deméter
        ArrayList<Integer> lista = new ArrayList<>();

        // 1º principio Deméter
        this.contador = contador;

        // 4º principio Deméter
        lista.add(contador);
    }
}
