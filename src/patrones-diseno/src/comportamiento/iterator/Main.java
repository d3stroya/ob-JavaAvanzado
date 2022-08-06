public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        Usuarios.crear(new Usuario("Franky", 31));
        Usuarios.crear(new Usuario("Bridget", 38));
        Usuarios.crear(new Usuario("Tess", 5));

        while(usuarios.hayMas()) {
            Usuario usuario = usuarios.siguiente();
            System.out.println(usuario.getNombre());
        }

        Usuarios.crear(new Usuario("Grace", 1));
        System.out.println("Añadiendo usuario nuevo...");
        System.out.println(usuarios.siguiente().getNombre());

        System.out.println("Reiniciando...");
        usuarios.reinicia();
        System.out.println(usuarios.siguiente().getNombre());
    }
}
