/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import poo3.objetos.ParDeNumeros;

/**
 *
 * @author lucia
 * Método mostrarValores que muestra cuáles son los dos números guardados.
 * 
 * Método devolverMayor para retornar cuál de los dos atributos tiene el 
 * mayor valor
 * 
 * Método calcularPotencia para calcular la potencia del mayor valor de la clase 
 * elevado al menor número. Previamente se deben redondear ambos valores.
 * 
 * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos 
 * valores. Antes de calcular la raíz cuadrada se debe obtener el valor 
 * absoluto del número.
 */
public class ParDeNumerosService {
    ParDeNumeros nuevo;
    public void mostrarValores (ParDeNumeros nuevo){
        System.out.println("Los numeros guardados son");
        System.out.println(nuevo.getNum1());
        System.out.println(nuevo.getNum2());
    }
    public double devolverMayor (ParDeNumeros nuevo){
        double mayor = Math.max(nuevo.getNum1(), nuevo.getNum2());
        System.out.println("El mayor de los dos numeros es: " + mayor);
        return mayor;
    }
    public int calcularPotencia (ParDeNumeros nuevo, double mayor){
        int menor = (int) Math.min(nuevo.getNum1(), nuevo.getNum2());
        int max = (int)mayor;
        double potencia = Math.pow(max, menor);
        System.out.println("La potencia de " + max + " y " + menor + " es " + potencia + ".");
        return menor;
    }
    public void calculaRaiz (double menor){
        menor = Math.abs(menor);
        System.out.println("La raiz cuadrada de " + menor + " es: " + Math.sqrt(menor));
    }
}
