public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        ReceptorRadio radio = new ReceptorRadio();
        ReceptorTV tv = new ReceptorTV();
        ReceptorSatelite sat = new ReceptorSatelite();

        // Agrega los receptores a la lista
        emisor.agregaReceptor(tv);
        emisor.agregaReceptor(radio);
        emisor.agregaReceptor(sat);

        // Envía señal
        emisor.emite();
    }
}
