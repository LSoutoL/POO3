/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Date;
import java.util.Scanner;
import poo3.objetos.Persona;

/**
 *
 * @author lucia
 * Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
 * 
 * Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
 * persona a crear. Retornar el objeto Persona creado.
 * 
 * Método calcularEdad que calcule la edad del usuario utilizando el atributo 
 * de fecha de nacimiento y la fecha actual.
 * 
 * Método menorQue recibe como parámetro una Persona y una edad. 
 * Retorna true si la persona es menor que la edad consultada o false en 
 * caso contrario.
 * 
 * Método mostrarPersona que muestra la información de la persona deseada.
 */
public class PersonaService {
    public Persona crearPersona (){
        Scanner leer = new Scanner(System.in);
        Date cumple = new Date ();
        System.out.println("Indique su nombre");
        String nombre=leer.nextLine();
        leer.hasNextLine();
        System.out.println("Indique su fecha de nacimiento.");
        System.out.println("dia:");
        cumple.setDate(leer.nextInt());
        System.out.println("mes:");
        cumple.setMonth(leer.nextInt()-1);
        System.out.println("anio");
        cumple.setYear(leer.nextInt()-1900);
        return new Persona(nombre, cumple);        
    }
    public void calcularEdad (Persona nueva){
        Date cumple = nueva.getFechadeNacimiento();
        Date fechaActual = new Date ();
        int edad;
        if (fechaActual.getMonth()< cumple.getMonth()){
            edad= fechaActual.getYear()-cumple.getYear()-1;
            } else if (fechaActual.getMonth()==cumple.getMonth() && fechaActual.getDay()< cumple.getDay()){
               edad = fechaActual.getYear()-cumple.getYear()-1;
        } else edad = fechaActual.getYear()-cumple.getYear();
        nueva.setEdad(edad);
    }
    public boolean menorQue (Persona nueva, int edad){
        return nueva.getEdad()<edad;
    }
    public void mostrarPersona (Persona nueva){
        System.out.println("Nombre: "+ nueva.getNombre());
        System.out.println("Fecha de Nacimiento: " + nueva.getFechadeNacimiento().toString());
        System.out.println("Edad: " + nueva.getEdad());
    }
}
