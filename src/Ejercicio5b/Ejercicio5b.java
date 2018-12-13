/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5b;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 *
 * @author Marcos
 */
public class Ejercicio5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Se usa el metodo setPriority para darle prioridad maxima al segundo hilo y minima al primero.       
       Hilos h1 = new Hilos(1);
       Hilos h2 = new Hilos(2);
       h1.setPriority(MIN_PRIORITY);
       h2.setPriority(MAX_PRIORITY);
       h2.start();
       h1.start();
    }
    }
    

