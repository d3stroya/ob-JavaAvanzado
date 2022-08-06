import java.util.ArrayList;

// Implementa la clase abstracta Mediator
public class MediadorConcreto extends Mediator {
    // Lista de colegas
    ArrayList<Colega> colegas = new ArrayList();

    // Implementación de métodos de Mediator
    @Override
    void registra(Colega colega) {
        // No se pueden añadir dos veces el mismo objeto, por lo que...
        // se añade un colega solo si no existe ya en la lista.
        if(!colegas.contains(colega)) {
            colegas.add(colega);
            // Especificar quién es su mediador
            // Le dice a Mediator que el mediador es MediadorConcreto
            colega.setMediator(this);
        }
    }

    @Override
    void reenvia(Colega colega) {
        for(Colega actual : colegas) {
            if(!actual.equals(colega)) {
                actual.recibe();
            }
        }
    }
}
