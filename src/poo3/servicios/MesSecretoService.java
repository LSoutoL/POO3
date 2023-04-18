/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Scanner;
import poo3.objetos.MesSecreto;

/**
 *
 * @author lucia
 */
public class MesSecretoService {
    
    public void adivinaMes (MesSecreto nuevo){
        Scanner leer = new Scanner(System.in);
         System.out.println("Adivine el mes secreto:");
        String mes = leer.next();
        while (!mes.equalsIgnoreCase(nuevo.getMesSecreto())){
            System.out.println("Incorrecto. Intentelo nuevamente.");
            mes=leer.next();
        }
        System.out.println("Correcto!");
    }
}
