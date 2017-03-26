/*
Diseño y programación de plataformas Móviles
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
Adán Rivera Sanchez
Sergio Arguedas Quesada
 */
package Modelo;

public class Estudiante extends Persona {

    public Estudiante(int telefono, String email, String nombre, String cedula, String F_nac, String clave, String car) {
        super(telefono, email, nombre, cedula, 4, clave);
        this.F_nac = F_nac;
        this.carrera = car;
    }

    public Estudiante() {
        super(4);
        this.F_nac = "";
        this.carrera = "";
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getF_nac() {
        return F_nac;
    }

    public void setF_nac(String F_nac) {
        this.F_nac = F_nac;
    }

    private String carrera;
    private String F_nac;
}
