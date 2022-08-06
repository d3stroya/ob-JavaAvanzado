public class FacturaElectricaUsuarios extends FacturaElectrica {
    @Override
    public double calcular() {
        return 0.55 + obtenerImpuesto(0.55);
    }
}
