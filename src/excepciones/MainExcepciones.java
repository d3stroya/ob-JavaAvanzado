package excepciones;

import java.io.IOException;

public class MainExcepciones {
    public static void main(String[] args) {

        // Va a generar error (excepción) y que el programa aborte. Gestinando el error, el programa sigue.
//        int valor = 5 / 0;

        // Captura de las excepciones
        try {
            int valor = 5 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }

        // Captura de una única excepción
        try {
            int valor = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            for(StackTraceElement valor : e.getStackTrace()) {
                System.out.println("Línea : " + valor.getLineNumber());
            }
        }

        // Se pueden gestionar varias excepciones
        try {
            divisionProCero(5);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
        } catch (IOException e) {
            System.out.println("IO excepcion");
        }

        // Excepción personalizada
        Users users = new Users();

        try {
            users.addUsers("Franky");
            users.addUsers("Franky");
            users.addUsers("Tess");
        } catch (UsersException e) {
            System.out.println(e.getMessage());
        }

        // Hay que evitar el uso de null, tanto en returns como en parámetros

    }

    // Hay que añadir las excepciones que vayamos a devolver/lanzar
    public static int divisionProCero(int valor) throws ArithmeticException, IOException {
        int resultado = 0;
        try {
            resultado = valor / 0;

            if(valor == 1) {
                // Devolver excepción
                throw new IOException();
            }
            // Capturar la excepción
        } catch(ArithmeticException e) {
            // Devolver excepción
            throw new ArithmeticException();
        }
        return resultado;
    }
}
