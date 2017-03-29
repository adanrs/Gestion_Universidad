/*
ADAN RIVERA SANCHEZ
SERGIO ARGUEDAS QUESADA
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
 */
package Modelo;

public class Persona {

    private int telefono;
    private String email;
    private String nombre;
    private String cedula;
    private int tipo;
    private String clave;
    private String carrera;

    public Persona(int telefono, String email, String nombre, String cedula, int tipo, String clave) {
        this.telefono = telefono;
        this.email = email;
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipo = tipo;
        this.clave = clave;
    }

    public Persona(int t) {
        telefono = 0;
        email = "";
        nombre = "";
        cedula = "";
        tipo = t;
        clave = "";
    }

    public Persona(String cedula, String nombre, String clave, String email, int telefono, int tipo, String carrera) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.clave = clave;
        this.email = email;
        this.telefono = telefono;
        this.tipo = tipo;
        this.carrera = carrera;
    }

    public Persona(String cedula, String clave, int tipo, String nombre, String correo, int telefono, String carrera) {
        this.cedula = cedula;
        this.clave = clave;
        this.tipo = tipo;
        this.nombre = nombre;
        this.email = correo;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public Persona(String clave, int tipo, String nombre, String correo, int telefono, String carrera) {
        this.clave = clave;
        this.tipo = tipo;
        this.nombre = nombre;
        this.email = correo;
        this.telefono = telefono;
        this.carrera = carrera;
    }

    public Persona(String nombre, String clave, String email, int telefono, int tipo, String carrera) {
        this.clave = clave;
        this.tipo = tipo;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.carrera = carrera;

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Persona{" + "telefono=" + telefono + ", email=" + email + ", nombre=" + nombre + ", cedula=" + cedula + ", tipo=" + tipo + ", clave=" + clave + '}';
    }

}
