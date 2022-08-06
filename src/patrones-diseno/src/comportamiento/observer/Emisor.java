import java.util.ArrayList;

// Implementa los métodos de Receptor
public class Emisor {
    // Lista de receptores
    private ArrayList<Receptor> receptor = new ArrayList<>();

    // Añadir receptores
    public void agregaReceptor(Receptor receptor) {
        this.receptor.add(receptor);
    }

    // Notificar a lista de receptores
    public void emite() {
        // Recorrer lista y notificar a cada receptor
        for(Receptor receptor : receptor) {
            receptor.recibe();
        }
    }
}
