/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Marcos
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Hilos h1 = new Hilos("hilo1");//Instanciar primer hilo
     Hilos h2 = new Hilos ("hilo2");//Instanciar segundo hilo
     h1.start();//Darle comienzo al primer hilo
     h2.start();//Darle comienzo al segundo hilo
    }
    
}
