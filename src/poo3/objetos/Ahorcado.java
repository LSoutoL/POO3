/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.objetos;

/**
 *
 * @author lucia
 * Crear una clase Ahorcado (como el juego), la cual deberá contener como 
 * atributos, un vector con la palabra a buscar, la cantidad de letras 
 * encontradas y la cantidad jugadas máximas que puede realizar el usuario.
 */
public class Ahorcado {
    private String [] palabra;
    private int letras;
    private int jugadasMax;

    public Ahorcado() {
    }
    public Ahorcado(String[] palabra, int jugadasMax) {
        this.palabra = palabra;
        this.jugadasMax = jugadasMax;
    }
    public String[] getPalabra() {
        return palabra;
    }
    public int getLetras() {
        return letras;
    }
    public int getJugadasMax() {
        return jugadasMax;
    }
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }
    public void setLetras(int letras) {
        this.letras = letras;
    }
    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }
}
