/*
Dise�o y programaci�n de plataformas M�viles
Laboratorio #1-2 � Back-End (Sistema de Gesti�n Acad�mica)
Ad�n Rivera Sanchez
Sergio Arguedas Quesada
 */
package Modelo;

import java.util.ArrayList;

public class Lista {

    private ArrayList lista;

    public Lista() {
        lista = new ArrayList();
    }

    public void agregar(Object e) {
        lista.add(0, e);
    }

    public void eliminar(Object e) {
        lista.remove(e);
    }

    @Override
    public String toString() {
        return lista.toString();
    }

}
