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
public class Hilos extends Thread{
    
    public final String nombre;//El nombre del hilo, básicamente lo que se usará para diferenciarlos
    public final int interrupcion = 5000;//Puse esta variable de interrupcion amplia para que haya variacion en el aleatorio y se note.
    
    
    public Hilos (String nombre){//El constructor, necesario para el ejercicio
        this.nombre = nombre;        
    }
    
    @Override public void run() {
        
        for(int i = 1; i <= 10; i++){            //En el ejercicio se requeria que se dieran los 10 primeros numeros seguidos del nombre del hilo
            System.out.println("nº: "+ i + "/ nombre: " + nombre);
            
            try {
                Thread.sleep((long) (Math.random() * interrupcion + 500)); //La interrupción, hecha con el método sleep, como era necesario en el ejercicio. interrupcion basicamente es el rango de los números, 500 es un margen de inicio para que no se de el caso de que la interrupcion sea muy corta.
            } catch (InterruptedException ex){
             //La excepcion porque el sleep necesita excepcion   
            }
        }
    }
    
}
