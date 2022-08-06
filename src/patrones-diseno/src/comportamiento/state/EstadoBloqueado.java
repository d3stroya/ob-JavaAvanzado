//package comportamiento.state;
//
//public class EstadoBloqueado extends Estado {
//    public EstadoBloqueado(Telefono telefono) {
//        super((estructurales.decorator.Telefono) telefono);
//    }
//    @Override
//    public String desbloquear() {
//        telefono.cambiaEstado(new EstadoDesbloqueado((Telefono) telefono));
//        return "Teléfono desbloqueado";
//    }
//
//    @Override
//    public String abrirCamara() {
//        return "La cámara no está disponible. Desbloquea el teléfono.";
//    }
//
//    @Override
//    public String hacerFoto() {
//        return "La función hacer fotos no está disponible. Desbloquea el teléfono.";
//    }
//}
