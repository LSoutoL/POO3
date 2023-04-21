/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.objetos;

/**
 *
 * @author lucia
 * Crea una clase en Java donde declares una variable de tipo array de Strings 
 * que contenga los doce meses del año, en minúsculas. A continuación, declara 
 * una variable mesSecreto de tipo String, y hazla igual a un elemento del array 
 * (por ejemplo, mesSecreto = mes[9].
 */
public class MesSecreto {
    private String [] anio = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String MesSecreto;

    public MesSecreto() {
        MesSecreto= anio [(int) (Math.random()*12)];
    }

    public String[] getAnio() {
        return anio;
    }

    public String getMesSecreto() {
        return MesSecreto;
    }
}

