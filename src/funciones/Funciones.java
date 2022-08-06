package funciones;

import java.util.Arrays;

public class Funciones {
    public static void main(String[] args) {
        // 1.
//        boolean mayor = esMayor(4, 2);

        // 2. Inlining
//        boolean mayor = 4 > 2 ? true : false;

        // 3.
        boolean bEsLaborable = esLaborable(5);

        // 4.
        determinaFruta("sandía");

        // 5.1
        int [] iNumeros = {1,2,3,4,5};
        int resultado = sumarNumeros(iNumeros);

        // 5.5. Sumar con parámetros variables
        System.out.println(sumarInfinitamente(1,2,3));
        System.out.println(sumarInfinitamente(5,6,43,2,54,132,76,3,6,312,7));

        // 6. Usar clase como parámetro en el constructor
        /*
        Ver clases Usuario (Modelo) y Usuarios (lista de usuarios con método agregarUsuario).
         */
        Usuarios usuarios = new Usuarios();

        Usuario usuario = new Usuario();
        usuario.nombre = "Bridget";
        usuario.apellidos = "Westfall";
        usuario.edad = 46;
//      usuarios.agregarUsuario(usuario);

        // 7. Con el manejo de excepciones hay que añadir try catch
//        try {
//            usuarios.agregarUsuario(usuario);
//            usuarios.agregarUsuario(usuario);
//        } catch(UserException e) {
//            System.out.println("Error al agregar objeto de usuario: " + e.getMessage());
//        }

        // 7.1. Agregar usuarios con iterancia
        Usuario usuario2 = new Usuario();
        usuario2.edad = 35;
        usuario2.nombre = "Franky";
        usuario2.apellidos = "Doyle";

        try {
            usuarios.agregarUsuarios(usuario);
            usuarios.agregarUsuarios(usuario2);
        } catch(UserException e) {
            System.out.println("Error al agregar objeto de usuario: " + e.getMessage());
        }

        System.out.println(usuario.nombre + " | " + usuario2.nombre);

    }


//    private static boolean esMayor(int a, int b) {
        // 1. Ejemplo de función absurda
//        if(a > b) {
//            return true;
//        } else {
//            return false;
//        }

        // 2. Refactorizado
//        return a > b ? true : false;
//    }

    // 3. Abuso de switch case
    public static boolean esLaborable(int dia) {
//        switch(dia) {
            // 3.1. ¿Puedo simplificarlo?
            /*

            case 1:
//                return true;
//                break;
            case 2:
//                return true;
//                break;
            case 3:
//                return true;
//                break;
            case 4:
//                return true;
//                break;
            case 5:
                return true;
                break;
            case 6:
//                return true;
//                break;
            case 7:
                return true;
                break;
        }
        */

        // 3.2. ¿Realmente necesito un switch?
            /*
        if(dia > 1 && dia < 6) {
            return true;
        } else {
            return false;
        }
        */

            // 3.3. ¿Puedo simplificarlo más?
            return dia > 0 && dia < 6;
    }

    // 4. No usar switch cuando hay que usarlo
    public static void determinaFruta(String sFruta) {
//        String sFruta = "Manzana";
        // 4.1.
//        if(sFruta == "Es una pera") {
//            System.out.println("Es una pera");
//        } else if (sFruta == "Es una banana") {
//            System.out.println("Es una banana");
//        } else if (sFruta == "Es una manzana") {
//            System.out.println("Es una manzana");
//        } else if (sFruta == "Es una sandía") {
//            System.out.println("Es una sandía");
//        } else {
//            System.out.println("Es otra fruta");
//        }

        // 4.2. Con switch
        switch(sFruta) {
            case "Pera":
                System.out.println("Es una pera");
                break;
            case "banana":
                System.out.println("Es una banana");
                break;
            case "manzana":
                System.out.println("Es una manzana");
                break;
            case "sandía":
                System.out.println("Es una sandía");
                break;
        }
    }

    // 5.1.
    // Funciones monádicas: reciben un único parámetro de entrada
    public static int sumarNumeros(int []numeros) {
//        int resultado = 0;
//        for(int numero : numeros) {
//            resultado += numero;
//        }
//        return resultado;

        // Con programación funcional
        // Stream va dando el array número a número
        // Reduce los "reduce" a un único número, en este caso, sumándolos
        int resultado = Arrays.stream(numeros).reduce(0, (a, b) -> a + b);
        return resultado;
    }

    // 5.2. Fucniones con dos argumentos: se llaman diádicas
    public static int sumarValores(int a, int b) {
        return a + b;
    }

    // 5.3. Función triádica o triada. Evitar más de 3 parámetros. En su lugar, argumentos variables.
    public static int sumarValores(int a, int b,int c) {
        return a + b + c;
    }

    // 5.4. Función forádica
    public static int sumarValores(int a, int b,int c,int d) {
        return a + b + c + d;
    }

    // 5.5. Argumentos variables: anteponer ... al argumento
    public static int sumarInfinitamente(int ...numeros) {
        int resultado = 0;
        for(int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
}
