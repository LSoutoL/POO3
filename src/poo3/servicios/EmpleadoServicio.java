/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Scanner;
import poo3.objetos.Empleado;


/**
 *
 * @author lucia
 * agregarEmpleado, eliminarEmpleado y buscarEmpleado.
 */
public class EmpleadoServicio {
    private int num=0;
    private Empleado [] nuevo;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Empleado [] agregarEmpleado (){
        System.out.println("Indique la cantidad de empleados que desea ingresar");
        int cantidad = leer.nextInt();
        this.num+=cantidad;
        nuevo = new Empleado [num];
        for (int i = num-cantidad; i < nuevo.length; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i+1));
            String nombre = leer.next();
            System.out.println("Indique la edad del empleado");
            int edad =leer.nextInt();
            System.out.println("Indique el salario que este percibe");
            double salario = leer.nextDouble();
            nuevo [i] = new Empleado(nombre, edad, salario);
        }
    return nuevo;
    }
    
    public Empleado [] eliminarEmpleado (){
        System.out.println("Indique el empleado que desea eliminar");
        String nombre = leer.next();
        for (int i = 0; i < nuevo.length; i++) {
            if (nombre.equals(nuevo[i].getNombre())){
                if (i<nuevo.length-1) {
                nuevo[i].setNombre(nuevo[i+1].getNombre());
                nuevo [i].setEdad(nuevo[i+1].getEdad());
                nuevo [i].setSalario(nuevo[i+1].getSalario());
                } else if (i==nuevo.length-1){
                nuevo[i].setNombre("");
                nuevo [i].setEdad(0);
                nuevo [i].setSalario(0);
                }
            }
        }
        return nuevo;
    }
    
    public void buscarEmpleado (){
        System.out.println("Indique el empleado que desea buscar");
        String nombre = leer.next();
        for (int i = 0; i < nuevo.length; i++) {
            if (nombre.equals(nuevo[i].getNombre())){
                System.out.println("Nombre:");
                System.out.println(nuevo [i].getNombre());
                System.out.println("Edad:");
                System.out.println(nuevo [i].getEdad());
                System.out.println("Salario");
                System.out.println(nuevo [i].getSalario());
            }
        }
    }
}
