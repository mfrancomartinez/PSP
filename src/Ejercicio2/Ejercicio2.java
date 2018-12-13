/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Marcos
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Se instancian los hilos
       Hilos h1 = new Hilos("hilo1");
       Hilos h2 = new Hilos("hilo2");
       Hilos h3 = new Hilos("hilo3");
       Hilos h4 = new Hilos("hilo4");
       //Se inician los hilos
       h1.start();
       h2.start();
       h3.start();
       h4.start();
               
    }
    
}
