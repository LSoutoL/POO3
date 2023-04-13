/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Scanner;
import poo3.objetos.Cadena;

/**
 *
 * @author lucia
 */
public class CadenaServicio {
    Cadena nueva;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void mostrarVocales (Cadena nueva){
        int contador =0;
        for (int i = 0; i < nueva.getLongitud(); i++) {
        String letra = nueva.getFrase().substring(i, i+1);
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            contador++;
        }
        }
        System.out.println("La frase posee " + contador + " vocales.");
    }
    public void invertirFrase (Cadena nueva){
        for (int i = nueva.getLongitud()-1; i >=0; i--) {
            System.out.print(nueva.getFrase().charAt(i));
        }
        System.out.println("");
    }
    public void vecesRepetido (Cadena nueva){
        System.out.println("Indique el carcater que desea buscar");
        String letra = leer.next();
        int contador =0;
        for (int i = 0; i < nueva.getLongitud(); i++) {
        String caracter = nueva.getFrase().substring(i, i+1);
            if (letra.equals(caracter)){
            contador++;
        }
        }
        System.out.println("La frase posee " + contador + " veces el carcater ingresado.");
    }
    public void compararLongitud (Cadena nueva){
        System.out.println("Ingrese una nueva frase");
        String frase2= leer.next();
        if (frase2.length()==nueva.getLongitud()){
            System.out.println("Las frases poseen la misma longitud.");
        } else System.out.println("Las frases no poseen la misma longitud.");
        
    }
    public void unirFrases (Cadena nueva) {
        System.out.println("Ingrese una nueva frase");
        String frase2=leer.nextLine();
        frase2 = nueva.getFrase().concat(frase2);
        System.out.println(frase2);
    }
    public void reemplazar (Cadena nueva){
        System.out.println("Indique el carater con el que desea reemplazar a la letra 'a'");
        String letra = leer.next();
        String nueva2= nueva.getFrase().replace("a", letra);
        System.out.println(nueva2);
    }
   public boolean contiene (Cadena nueva){
       System.out.println("Indique la letra que desea buscar");
       String letra = leer.next();
       boolean contiene = nueva.getFrase().contains(letra);
       return contiene;
   }
   
        
}
