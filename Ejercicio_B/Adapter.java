package ec.edu.espol.Adapter;

public interface I_ReproductorAudio {
    /*
     Codigo de la interfaz
    */
    public void reproducir(String archivo);
}


public class ImplementacionReproductor implements I_ReproductorAudio {
    /*
     Codigo de ImplementacionReproductor
    */
    public void reproducir(String archivo) {
        /*
         Codigo de reproducir en ImplementacionReproductor
        */
    }
}


public class ReproductorMP3 {
    public void reproducirMP3(String nombreArchivo) {
        /*
         Codigo de reproducirMP3
        */
        System.out.println("[ReproductorMP3] Reproduciendo archivo MP3: " + nombreArchivo);
    }
}


public aspect Aspecto_adapter_reproductor {
    /*
     Codigo del aspect
    */

    pointcut llamadaReproducir(String archivo):
        execution(void I_ReproductorAudio.reproducir(String)) && args(archivo);

    void around(String archivo) : llamadaReproducir(archivo) {
        ReproductorMP3 adaptee = new ReproductorMP3();

        adaptee.reproducirMP3(archivo);
    }
}


public class Cliente {
    /*
     Codigo del cliente
    */

}
