//package comportamiento.state;
//
//public class EstadoDesbloqueado extends Estado {
//    public EstadoDesbloqueado(Telefono telefono) {
//        super((estructurales.decorator.Telefono) telefono);
//    }
//    @Override
//    public String desbloquear() {
//
//        return "Móvil desbloqueado";
//    }
//
//    @Override
//    public String abrirCamara() {
//
//        telefono.cambiaEstado(new EstadoCamaraAbierta((Telefono) telefono));
//        return "Cámara abierta, puedes hacer la foto";
//    }
//
//    @Override
//    public String hacerFoto() {
//
//        return "No se puede hacer la foto porque no está abierta la cámara";
//    }
//}
