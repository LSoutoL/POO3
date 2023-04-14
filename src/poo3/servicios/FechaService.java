/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author lucia
 * Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
 * uego los pase por parámetro a un nuevo objeto Date. El método debe retornar 
 * el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 * Método fechaActual que cree un objeto fecha con el día actual. 
 * Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
 * El método debe retornar el objeto Date.
 * Método diferencia que reciba las dos fechas por parámetro y retorna la 
 * diferencia de años entre una y otra (edad del usuario).

 */
public class FechaService {
    public Date fechadeNacimiento (){
        Scanner leer = new Scanner(System.in);
        Date cumple = new Date();
        System.out.println("Indique su fecha de nacimiento.");
        System.out.println("dia:");
        cumple.setDate(leer.nextInt());
        System.out.println("mes:");
        cumple.setMonth(leer.nextInt()-1);
        System.out.println("anio");
        cumple.setYear(leer.nextInt()-1900);
        return cumple;
    }
    public Date fechaActual (){
    return new Date ();
    }
    public void diferencia (Date fechaActual, Date fechadeNacimiento){
        int edad;
        if (fechaActual.getMonth()< fechadeNacimiento.getMonth()){
            edad= fechaActual.getYear()-fechadeNacimiento.getYear()-1;
            } else if (fechaActual.getMonth()==fechadeNacimiento.getMonth() && fechaActual.getDay()< fechadeNacimiento.getDay()){
               edad = fechaActual.getYear()-fechadeNacimiento.getYear()-1;
        } else edad = fechaActual.getYear()-fechadeNacimiento.getYear();
        System.out.println("Su edad es: " + edad);
    }
}
