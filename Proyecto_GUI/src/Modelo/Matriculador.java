/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Modelo;

public class Matriculador extends Persona {

    public Matriculador(int telefono, String email, String nombre, String cedula, String clave) {
        super(telefono, email, nombre, cedula, 2, clave);
    }

    public Matriculador() {
        super(2);
    }

}
