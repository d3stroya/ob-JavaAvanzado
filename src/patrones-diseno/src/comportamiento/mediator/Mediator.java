abstract public class Mediator {
    // Registra un colega(1)
    abstract void registra(Colega colega);

    // Un mensaje llega de otro (2)

    // Reenvía a 1 el mensaje que le llega de 2
    abstract void reenvia(Colega colega);
}
