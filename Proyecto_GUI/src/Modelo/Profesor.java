/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Modelo;

public class Profesor extends Persona {

    public Profesor(int telefono, String email, String nombre, String cedula, String clave) {
        super(telefono, email, nombre, cedula, 3, clave);
    }

    public Profesor() {
        super(3);
    }

}
