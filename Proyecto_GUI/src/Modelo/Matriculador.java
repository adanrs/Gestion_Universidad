/*
Dise�o y programaci�n de plataformas M�viles
Laboratorio #1-2 � Back-End (Sistema de Gesti�n Acad�mica)
Ad�n Rivera Sanchez
Sergio Arguedas Quesada
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
