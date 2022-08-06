//package comportamiento.state;
//
//public class EstadoCamaraAbierta extends Estado {
//    public EstadoCamaraAbierta(Telefono telefono) {
//        super((estructurales.decorator.Telefono) telefono);
//    }
//    @Override
//    public String desbloquear() {
//        return "No se puede desbloquear. El móvil ya está desbloqueado";
//    }
//
//    @Override
//    public String abrirCamara() {
//        return "La cámara ya está abierta.";
//    }
//
//    @Override
//    public String hacerFoto() {
//        telefono.cambiaEstado(new EstadoHacerFoto((Telefono) telefono));
//        return "Ahora puedes hacer fotos.";
//    }
//}
