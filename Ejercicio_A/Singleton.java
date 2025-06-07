

package com.mycompany.singleton;


public class Singleton {

    public static void main(String[] args) {
        // Intentando obtener la única instancia del Gobierno
        Gobierno gobierno1 = Gobierno.getInstance();
        Gobierno gobierno2 = Gobierno.getInstance();

        // Verificando que ambas variables apuntan a la misma instancia
        System.out.println("¿Ambos gobiernos son el mismo? " + (gobierno1 == gobierno2)); // Imprime true

        // El gobierno realiza una acción
        gobierno1.gobernar();
    }

    // Clase Gobierno (Singleton)
    static class Gobierno { // Hacemos que la clase Gobierno sea estática

        private static Gobierno instance;

        private Gobierno() {
            System.out.println("Gobierno creado.");
        }

        public static synchronized Gobierno getInstance() {
            if (instance == null) {
                instance = new Gobierno();
            }
            return instance;
        }

        public void gobernar() {
            System.out.println("El Gobierno está gestionando el país.");
        }
    }
}
