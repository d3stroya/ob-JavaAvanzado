abstract public class FacturaElectrica {
    double impuesto = 21;

    double obtenerImpuesto(double precio) {
        return precio * impuesto / 100;
    }


     // Dos funciones casi idénticas y que, por tanto, se pueden abstraer

//    public double calcularPrecioUsuario() {
//        return 0.55 + obtenerImpuesto(0.55);
//    }
//
//    public double calcularPrecioEmpresas() {
//        return 0.90 + obtenerImpuesto(0.90);
//    }

    // Método abstracto en su lugar:
    abstract double calcular();

}
