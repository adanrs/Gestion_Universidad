/*
Diseño y programación de plataformas Móviles
Laboratorio #1-2 – Back-End (Sistema de Gestión Académica)
Adán Rivera Sanchez
Sergio Arguedas Quesada
 */
package Modelo;

public class Nota {

    private int NOTA;
    private String CURSO;
    private String ESTUDIANTE;
    private int grupo;
    private String condicion;

    public Nota(int NOTA, String CURSO, String ESTUDIANTE, int grupo, String condision) {
        this.NOTA = NOTA;
        this.CURSO = CURSO;
        this.ESTUDIANTE = ESTUDIANTE;
        this.grupo = grupo;
        this.condicion = condision;
    }

    public Nota() {
        this.NOTA = 0;
        this.CURSO = "";
        this.ESTUDIANTE = "";
        this.grupo = 0;
        this.condicion = "";
    }
	
	public Nota(String est) {
        this.NOTA = 0;
        this.CURSO = "";
        this.ESTUDIANTE = est;
        this.grupo = 0;
        this.condicion = "";
    }

    public int getNOTA() {
        return NOTA;
    }

    public void setNOTA(int NOTA) {
        this.NOTA = NOTA;
    }

    public String getCURSO() {
        return CURSO;
    }

    public void setCURSO(String CURSO) {
        this.CURSO = CURSO;
    }

    public String getESTUDIANTE() {
        return ESTUDIANTE;
    }

    public void setESTUDIANTE(String ESTUDIANTE) {
        this.ESTUDIANTE = ESTUDIANTE;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Cod Curso: " + CURSO + ", grupo # " + grupo + ", Estudiante: " + ESTUDIANTE + ", Condicion:" + condicion + ", nota:" + NOTA;
    }

}
