/*
Dise�o y programaci�n de plataformas M�viles
Laboratorio #1-2 � Back-End (Sistema de Gesti�n Acad�mica)
Ad�n Rivera Sanchez
Sergio Arguedas Quesada
 */
package Modelo;

public class Administrador extends Persona {

    public Administrador(int telefono, String email, String nombre, String cedula, String clave) {
        super(telefono, email, nombre, cedula, 1, clave);
    }

    public Administrador() {
        super(1);
    }

}
