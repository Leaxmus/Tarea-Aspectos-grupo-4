
package com.mycompany.tarea_aspectos;
// Cliente que usa la interfaz objetivo

public class Adapter {
    public static void main(String[] args) {
        // Creamos una instancia de la clase incompatible
        ReproductorMP3 viejoReproductor = new ReproductorMP3();

        // Creamos el adaptador que traduce a la interfaz esperada
        ReproductorAudio adaptador = new AdaptadorReproductorMP3(viejoReproductor);

        // El cliente usa la interfaz esperada sin preocuparse por la implementación
        adaptador.reproducir("cancion_favorita.mp3");
    }
}

// Interfaz objetivo (Target)
interface ReproductorAudio {
    void reproducir(String archivo);
}

// Clase existente con interfaz incompatible (Adaptee)
class ReproductorMP3 {
    public void reproducirMP3(String nombreArchivo) {
        System.out.println("Reproduciendo archivo MP3: " + nombreArchivo);
    }
}

// Adaptador que traduce la interfaz (Adapter)
class AdaptadorReproductorMP3 implements ReproductorAudio {
    private ReproductorMP3 reproductorMP3;

    // Constructor recibe una instancia del adaptee
    public AdaptadorReproductorMP3(ReproductorMP3 reproductorMP3) {
        this.reproductorMP3 = reproductorMP3;
    }

    // Implementación del método esperado, usando la clase existente
    @Override
    public void reproducir(String archivo) {
        reproductorMP3.reproducirMP3(archivo); // Adaptación
    }
}
