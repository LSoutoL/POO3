/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Arrays;

/**
 *
 * @author lucia
 */
public class ArregloServicio {
     public double [] inicializarA (double [] arreglo){
        for (int i = 0; i <arreglo.length; i++) {
            arreglo [i] = Math.random()*10;
        }
        return arreglo;
    }
    public void mostrar (double [] arreglo){
        System.out.println(Arrays.toString(arreglo));
    }
    public void ordenar (double [] arreglo){
       Arrays.sort(arreglo);
       double [] arreglo2 = new double [arreglo.length];
       int j= arreglo.length-1;
        for (int i = 0; i <arreglo2.length; i++) {
                arreglo2 [i] = arreglo [j];
                j--;
            }
        System.out.println(Arrays.toString(arreglo2));
    }
    public double [] inicializarB (double [] arreglo, double [] arreglo2){
        for (int i = 0; i < arreglo2.length/2; i++) {
           arreglo2[i]=arreglo[i];
        }
        Arrays.fill(arreglo2, arreglo2.length/2, arreglo2.length-1, 0.5);
        System.out.println(Arrays.toString(arreglo2));
     return arreglo2;
    }
}
