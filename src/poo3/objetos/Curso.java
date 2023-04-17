/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.objetos;

/**
 *
 * @author lucia
 * Para ello, crearemos una clase entidad llamada Curso, cuyos atributos serán: 
 * nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o 
 * tarde),  precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String 
 * de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A 
 * continuación, se implementarán los siguientes métodos:
 * Un constructor por defecto.
 * Un constructor con todos los atributos como parámetro.
 * Métodos getters y setters de cada atributo.
 */
public class Curso {
    private String nombreCurso;
    private int horasDia;
    private int diaSemana;
    private String turno;
    private int precioHora;
    private String [] alumnos = new String [5];

    public Curso() {
    }

    public Curso(String nombreCurso, int horasDia, int diaSemana, String turno, int precioHora, String [] alumnos) {
        this.nombreCurso = nombreCurso;
        this.horasDia = horasDia;
        this.diaSemana = diaSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos=alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public int getDiaSemana() {
        return diaSemana;
    }

    public String getTurno() {
        return turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
