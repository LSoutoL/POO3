/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.servicios;

import java.util.Arrays;
import java.util.Scanner;
import poo3.objetos.Productos;

/**
 *
 * @author lucia
 * que tenga los siguientes métodos: agregarProducto, eliminarProducto y buscarProducto.
 */
public class ProductosServicio {
    private int num=0;
    private Productos [] nuevo;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Productos [] agregarProducto (){
        System.out.println("Indique la cantidad de productos que desea ingresar");
        int cantidad = leer.nextInt();
        this.num+=cantidad;
        nuevo = new Productos [num];
        for (int i = num-cantidad; i < nuevo.length; i++) {
            System.out.println("Ingrese el nombre del producto" + (i+1));
            String nombre = leer.next();
            System.out.println("Describa el producto");
            String descripcion =leer.next();
            System.out.println("Indique el precio del producto");
            double precio = leer.nextDouble();
            nuevo [i] = new Productos(nombre, descripcion, precio);
        }
    return nuevo;
    }
    
    public Productos [] eliminarProducto (){
        System.out.println("Indique el producto que desea eliminar");
        String nombre = leer.next();
        for (int i = 0; i < nuevo.length; i++) {
            if (nombre.equals(nuevo[i].getNombre())){
                if (i<nuevo.length-1) {
                nuevo[i].setNombre(nuevo[i+1].getNombre());
                nuevo [i].setDescripcion(nuevo[i+1].getDescripcion());
                nuevo [i].setPrecio(nuevo[i+1].getPrecio());
                } else if (i==nuevo.length-1){
                nuevo[i].setNombre("");
                nuevo [i].setDescripcion("");
                nuevo [i].setPrecio(0);
                }
            }
        }
        return nuevo;
    }
    
    public void buscarProducto (){
        System.out.println("Indique el producto que desea buscar");
        String nombre = leer.next();
        for (int i = 0; i < nuevo.length; i++) {
            if (nombre.equals(nuevo[i].getNombre())){
                System.out.println("Nombre:");
                System.out.println(nuevo [i].getNombre());
                System.out.println("Descripcion:");
                System.out.println(nuevo [i].getDescripcion());
                System.out.println("Precio");
                System.out.println(nuevo [i].getPrecio());
            }
        }
    }
}
