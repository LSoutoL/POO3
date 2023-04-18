/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Arrays;
import java.util.Scanner;
import poo3.objetos.Ahorcado;

/**
 *
 * @author lucia
 * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
 * máxima. Con la palabra del usuario, pone la longitud de la palabra, como la 
 * longitud del vector. Después ingresa la palabra en el vector, letra por letra, 
 * quedando cada letra de la palabra en un índice del vector. Y también, guarda 
 * la cantidad de jugadas máximas y el valor que ingresó el usuario.
 * 
 * Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
 * Nota: buscar como se usa el vector.length.
 * 
 * Método buscar(letra):  este método recibe una letra dada por el usuario y 
 * busca si la letra ingresada es parte de la palabra o no. También informará si 
 * la letra estaba o no.
 * 
 * Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
 * muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
 * además deberá devolver true si la letra estaba y false si la letra no estaba, 
 * ya que, cada vez que se busque una letra que no esté, se le restará uno a sus 
 * oportunidades.
 * 
 * Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
 * 
 * Método juego(): el método juego se encargará de llamar todos los métodos 
 * previamente mencionados e informará cuando el usuario descubra toda la 
 * palabra o se quede sin intentos. Este método se llamará en el main.
 */
public class AhorcadoService {
    private Ahorcado nuevo;
    private Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego (){
        System.out.println("Ingrese la palabra a adivinar");
        String frase = leer.next();
        String [] palabra = new String [frase.length()];
        for (int i = 0; i <palabra.length; i++) {
            palabra[i]= frase.substring(i,i+1);
        }
        System.out.println("Indique el maximo de intentos");
        int jugadasMax = leer.nextInt();
        nuevo = new Ahorcado(palabra, jugadasMax);
        return nuevo;        
    }
    public void longitud (){
        System.out.println("La palabra tiene " + nuevo.getPalabra().length + " letras.");
    }
    public void buscar (String letra){
        int contador =0;
        int resultado=0;
        for (int i = 0; i <nuevo.getPalabra().length; i++) {
            if (nuevo.getPalabra()[i].equals(letra)) {
                nuevo.setLetras(nuevo.getLetras()+1);
                contador++;
                resultado++;
                
            }
        }
        if (contador==0) {
                System.out.println("La letra no es parte de la palabra");
            } else if (contador>0) {
               System.out.println("La letra es parte de la palabra");
            }
    }
    public boolean encontradas (String letra){
        boolean encontradas = false;
        for (int i = 0; i <nuevo.getPalabra().length; i++) {
            if (letra.equals(nuevo.getPalabra()[i])) {
                encontradas=true;
            }
        }
        System.out.println("Ya fueron encontradas " + nuevo.getLetras() + ". Restan " + (nuevo.getPalabra().length-nuevo.getLetras())+ " letras.");
    return encontradas;
    }
    public int intentos(boolean encontradas){
        int intentos =0;
        if (encontradas==false) {
             intentos++;           
        }
        return intentos;    
    }
    public void juego (){
        crearJuego();
        longitud();
        int intentos =0;
        do{
        System.out.println("Adivine una letra");
        String letra = leer.next();
        buscar (letra);
        boolean encontradas = encontradas(letra);
        System.out.println(encontradas);
        intentos +=  intentos (encontradas);
        System.out.println("Le quedan " + (nuevo.getJugadasMax()-intentos)+ " oportunidades.");
    }  while ((nuevo.getLetras()!=nuevo.getPalabra().length) && (intentos < nuevo.getJugadasMax()));
        if ((nuevo.getLetras()==nuevo.getPalabra().length)) {
            System.out.println("Ganaste!");
            System.out.println("La palabra es " + Arrays.toString(nuevo.getPalabra()));
        } else System.out.println("Perdiste! La palabra es " + Arrays.toString(nuevo.getPalabra()));
    }   
}
