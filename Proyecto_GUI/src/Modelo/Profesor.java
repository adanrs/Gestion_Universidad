/*
Dise�o y programaci�n de plataformas M�viles
Laboratorio #1-2 � Back-End (Sistema de Gesti�n Acad�mica)
Ad�n Rivera Sanchez
Sergio Arguedas Quesada
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
