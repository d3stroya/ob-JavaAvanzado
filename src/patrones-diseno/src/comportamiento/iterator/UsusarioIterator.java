public interface UsusarioIterator {
    // Métodos más comunes:
    /*
    next(); // Devuelve el siguiente elemento
    reset();    // Reinicia el contador
    hasMore();  // Indica si hay más elementos o no
*/
    Usuario siguiente();
    void reinicia();
    boolean hayMas();
}

