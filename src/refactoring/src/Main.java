package refactoring.src;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []numeros = {12, 23, 45, 1, 9};
        impMayorMenor(numeros);

        // B
        // Constructor largo
        ConstructorLargo cosa = new ConstructorLargo("a", "b", "c");

        // REFACTOR Builder
        ConstructorLargoBuilder cosaBuilder = new ConstructorLargoBuilder("marca")
                .marca("b")
                .motor("c");
    }

    // A
    public static void impMayorMenor(int [] numeros) {
//        int mayor = 0;
//        int menor = numeros[0];
        // 1. SIN REFACTORIZAR
//        for(int i = 0; i < numeros.length; i++) {
//            if(mayor < numeros[i]) {
//                mayor = numeros[i];
//            }
//            if(menor > numeros[i]) {
//                menor = numeros[i];
//            }
//        }
        // 2. REFACTORIZACIÓN CON OPERADOR TERNARIO
//        for(int i = 0; i < numeros.length; i++) {
//            mayor = mayor < numeros[i] ? numeros[i] : mayor;
//            menor = menor > numeros[i] ? numeros[i] : menor;
//        }

        // 3. REFACTORIZACIÓN CON FOREACH
//        for(int numero : numeros) {
//            mayor = mayor < numero ? numero : mayor;
//            menor = menor > numero ? numero : menor;
//        }

        // 4. REFACTORIZACIÓN CON PROGRAMACIÓN FUNCIONAL
        int mayor = Arrays.stream(numeros).reduce(0, (a, b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a < b ? a : b);

        System.out.println("Mayor: " + mayor + " y menor: " + menor);
    }

    public static int ifAnidado1() {
        int v1 = 10;
        int v2 = 10;
        // SIN REFACTO
//        if(v1 > v2) {
//            return v1;
//        } else {
//            return v2;
//        }

        // REFACTOR EXTRAER EL VALOR DE RETORNO
        if(v1 > v2) {
            return v1;
        }
        return v2;
    }


    // C
    // RAFACTOR INLINING: pasar parte de la función a la función padre
    public boolean hoyEsDomingo(int numero) {
//        boolean isDomingo = hoyEsDiaNumero(7);
        boolean isDomingo = (numero == 7 ? true : false);
        System.out.println(isDomingo);
        return isDomingo;
    }

//    public static boolean hoyEsDiaNumero(int numero) {
//        if(numero == 7) {
//            return true;
//        }
//        return false;
//    }

    // D
    // REFACTOR EXTRACCIÓN DE VARIABLES
    public boolean esJavaMacOs() {
        boolean runtime = System.getProperty("java.runtime.name").contains("Oracle");
        boolean osVersion = System.getProperty("os.version").compareTo("11.6") == 0 ? true : false;

        if(runtime && osVersion) {
            System.out.println("Es Oracle JVM en macOs 11.6");
        }

//        if(System.getProperty("java.runtime.name").contains("Oracle")
//        && System.getProperty("os.version").compareTo("11.6") == 0) {
//            return true;
//        } else {
//            return false;
//        }

        return runtime;
    }
}
