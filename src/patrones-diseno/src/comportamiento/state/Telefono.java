//package comportamiento.state;
//
//public class Telefono {
//    // ATRIBUTOS
//    public Estado estado;
//
//    // CONSTRUCTOR
//    public Telefono() {
//        // El estado inicial del tfn es bloqueado
//        estado = new EstadoBloqueado(this);
//
//    }
//
//    // MÉTODOS
//    public void cambiaEstado(Estado estado) {
//        System.out.println("Estado inicial: " + this.estado.getClass().getName());
//        this.estado = estado;
//        System.out.println("Estado final: " + this.estado.getClass().getName());
//    }
//
//    public Estado getEstado() {
//        return estado;
//    }
//}
