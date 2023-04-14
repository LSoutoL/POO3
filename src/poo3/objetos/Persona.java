/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.objetos;

import java.util.Date;

/**
 *
 * @author lucia
 * 
 */
public class Persona {
    private String nombre;
    private Date fechadeNacimiento;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, Date fechadeNacimiento) {
        this.nombre = nombre;
        this.fechadeNacimiento=fechadeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechadeNacimiento(Date fechadeNacimiento) {
       this.fechadeNacimiento=fechadeNacimiento;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
}
