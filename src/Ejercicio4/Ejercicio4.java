/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author Marcos
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilos h1 = new Hilos (1);//Se instancia el hilo referente a la suma de los pares
        Hilos h2 = new Hilos (2);//Se instancia el hilo referente a la suma de los impares        
        Hilos h3 = new Hilos (3);//Se instancia el hilo referente a la suma de los acabados en 2 o 3
    }
    
}
