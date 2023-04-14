/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import java.util.Date;
import java.util.Scanner;
import poo3.objetos.Persona;
import poo3.objetos.Cadena;
import poo3.objetos.ParDeNumeros;
import poo3.servicios.CadenaServicio;
import poo3.servicios.ParDeNumerosService;
import poo3.servicios.ArregloServicio;
import poo3.servicios.FechaService;
import poo3.servicios.PersonaService;

/**
 *
 * @author lucia
 */
public class POO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        /*System.out.println("Ingrese una frase");
        Cadena nueva = new Cadena(leer.next());
        CadenaServicio servicio = new CadenaServicio ();
        int opcion;
        do {
        System.out.println("Indique la accion que desea llevar adelante");
            System.out.println("1. Contar la cantidad de vocales");
            System.out.println("2. Invertir la frase");
            System.out.println("3. Contar cuantas veces se repita una letra");
            System.out.println("4. Comparar la longitud");
            System.out.println("5. Unir dos frases");
            System.out.println("6. Reemplazar por una letra");
            System.out.println("7. Comprobar si la frase contiene una letra");
            System.out.println("8. Salir");
        opcion = leer.nextInt();
        switch (opcion){
            case 1: servicio.mostrarVocales(nueva);
            break;
            case 2: servicio.invertirFrase(nueva);
            break;
            case 3: servicio.vecesRepetido(nueva);
            break;
            case 4: servicio.compararLongitud(nueva);
            break;
            case 5: servicio.unirFrases(nueva);
            break;
            case 6: servicio.reemplazar(nueva);
            break;
            case 7: boolean contiene = servicio.contiene(nueva);
                    if (contiene==true){
                        System.out.println("verdadero.");
                    } else System.out.println("falso.");
            break;
        }           
        } while (opcion!=8);*/
        /*ParDeNumerosService servicio = new ParDeNumerosService ();
        ParDeNumeros nuevo = new ParDeNumeros();
        servicio.mostrarValores(nuevo);
        double mayor = servicio.devolverMayor(nuevo);
        double menor = servicio.calcularPotencia(nuevo, mayor);
        servicio.calculaRaiz(menor);*/
        
        //Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
        
        /*double [] A = new double [50];
        double [] B = new double [20];
        ArregloServicio servicio = new ArregloServicio ();
        servicio.inicializarA(A);
        servicio.mostrar(A);
        servicio.ordenar(A);
        servicio.inicializarB(A, B);*/
        
        /*FechaService nuevo = new FechaService();
        Date fechadeNacimiento = nuevo.fechadeNacimiento();
        Date fechaActual= nuevo.fechaActual();
        nuevo.diferencia(fechaActual, fechadeNacimiento);*/
        
        PersonaService servicio = new PersonaService();
        Persona nueva = servicio.crearPersona();
        servicio.calcularEdad(nueva);
        System.out.println("Indique la edad respecto de la cual desea saber si la persona es menor:");
        int edad = leer.nextInt();
        System.out.println(servicio.menorQue(nueva, edad));
        servicio.mostrarPersona(nueva);
        
   }
        
    
}
