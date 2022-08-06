public class FacturaElectricaEmpresas extends FacturaElectrica{
    @Override
    public double calcular() {
        return 0.90 + obtenerImpuesto(0.90);
    }
}
