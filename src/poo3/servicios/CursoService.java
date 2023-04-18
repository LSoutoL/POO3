/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Scanner;
import poo3.objetos.Curso;

/**
 *
 * @author lucia
 * Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
 * alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
 * esta información en un arreglo e iterar con un bucle, solicitando en cada 
 * repetición que se ingrese el nombre de cada alumno.
 * 
 * Método crearCurso(): el método crear curso, le pide los valores de los 
 * atributos al usuario y después se le asignan a sus respectivos atributos para 
 * llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
 * para asignarle valor al atributo alumnos
 * 
 * Método calcularGananciaSemanal(): este método se encarga de calcular la 
 * ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
 * de horas por día, el precio por hora, la cantidad de alumnos y la cantidad 
 * de días a la semana que se repite el encuentro.
 * 
 */
public class CursoService {
    private Scanner leer = new Scanner(System.in);
     public String [] cargarAlumnos (){
        String [] alumnos = new String [5];
        for (int i = 0; i < alumnos.length ; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1));
            alumnos [i]=leer.next();            
        }
        return alumnos;
    }
    public Curso crearCurso (){
        System.out.println("Indique el nombre del curso");
        String nombre = leer.next();
        System.out.println("Indique la cantidad de horas por dia");
        int horasDias = leer.nextInt();
        System.out.println("Indique la cantidad de dias a la semana");
        int diaSemana = leer.nextInt();
        System.out.println("Indique el turno al que pertenece (manana/tarde):");
        String turno = leer.next();
        System.out.println("Indoque el precio de la hora de clase");
        int precioHora = leer.nextInt();
        String [] alumnos = cargarAlumnos();
        return new Curso(nombre, horasDias, diaSemana, turno, precioHora, alumnos);
    }
    public void calcularGananciaSemanal (Curso nuevo){
        System.out.println("Su ganacia semanal es igual a: " + (nuevo.getPrecioHora()*nuevo.getHorasDia()*nuevo.getAlumnos().length*nuevo.getDiaSemana()));
    }
}
