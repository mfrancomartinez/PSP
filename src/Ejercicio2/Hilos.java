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
public class Hilos extends Thread{
    
     public final String nombre;//Nombre del hilo
    
    public Hilos(String nombre){ //Constructor
        
        this.nombre = nombre;
       
    }
    
    @Override public void run() {

        for(int i = 1; i <= 5; i++){//Los hilos escribiran la secuencia 5 veces
            
            System.out.println("nº: "+ i + "/ nombre: " + nombre);
            
            try {
                Thread.sleep(1000);//La interrupcion está fija en el segundo.                
            } catch (InterruptedException ex) {
            }
        }
    }
}
