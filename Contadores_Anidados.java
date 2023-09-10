//contadores anidados
package com.mycompany.contadores_anidados;

public class Contadores_Anidados {

    public static void main(String[] args) {
        // Declaración e inicialización de variables de contador
        int contadorUno = 0;
        int contadorDos = 10;
        int contadorTres = 20;

        // Bucle exterior controlado por contadorUno
        while (contadorUno < 5) {
            // Bucle anidado controlado por contadorDos
            while (contadorDos > 5) {
                // Bucle do-while controlado por contadorTres
                do {
                    // Impresión de los valores de los contadores
                    System.out.println("Contador Uno: " + contadorUno);
                    System.out.println("Contador Dos: " + contadorDos);
                    System.out.println("Contador Tres: " + contadorTres);

                    // Decremento de contadorTres
                    contadorTres--;

                    // Actualización de contadorDos basado en contadorTres
                    if (contadorTres % 2 == 0) {
                        contadorDos -= 2;
                    } else {
                        contadorDos--;
                    }
                } while (contadorTres > 10);

                // Incremento de contadorUno
                contadorUno++;
            }

            // Restablecimiento del valor de contadorDos
            contadorDos = 10;
        }
    }
}
