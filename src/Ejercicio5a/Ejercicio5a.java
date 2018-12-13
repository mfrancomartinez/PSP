/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5a;

/**
 *
 * @author Marcos
 */
public class Ejercicio5a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//El metodo join fuerza al hilo al que se le aplica la orden de esperar hasta que otros hilos acaben. El número entre los paréntesis es el tiempo de espera desde el inicio.
        Hilos h1 = new Hilos(1);
        Hilos h2 = new Hilos(2);
        
        h1.setPriority(1);
        h2.setPriority(10);
        
        h2.start();
        h1.start();        
        
        try {           
            h1.join(100);
        } catch (InterruptedException ex) {
        }
    }
    }
    

