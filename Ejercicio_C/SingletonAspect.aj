package aspectos.Ejercico_C;

import apesctos.Ejercico_C.Gobierno;

public aspect SingletonAspect {
    private Gobierno instancia;

    pointcut constructor(): call(Gobierno.new());

    Object around(): constructor() {
        if (instancia == null) {
            instancia = new Gobierno();
        } else {
            System.out.println("[Aspecto] Reutilizando instancia existente.");
        }
        return instancia;
    }
}