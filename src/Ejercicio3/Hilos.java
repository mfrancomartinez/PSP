/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Marcos
 */
public class Hilos extends Thread{
    private static int num = 0;
    private Hilos hilo;
    
    public Hilos(){//Para la construccion de hilos en este ejercicio se debe de cambiar ligeramente el constructor.
            System.out.println("Inicio del hilo: "+this.getName());//Se indica el inicio del hilo.
            num++;//Se crea un puntero para indicar cuantos hilos ya fueron creados.
            this.start();//En este caso es mucho más comodo usar el start en el constructor que en el principal, de lo contrario no se aplica bien en todos los hilos.
            
            if (num < 5){//El numero indicado de hilos es 5.
                    
                hilo = new Hilos();
            }
    }
    
    @Override public void run() {
        
        for(int i = 1; i <= 10; i++){//Cadda hilo debe expresar lo mismo que en ejercicios anteriores 10 veces. Usar la variable nombre para esto sería muy complicado así que se aprovecha el getName() de la clase Thread.
            
           System.out.println("nº: "+ i + "/ nombre: " + this.getName());
            
            try {
                Thread.sleep((long) (Math.random() * 600 + 100));//El tiempo de espera es entre 100 y 600 milisegundos como estaba estipulado
            } catch (InterruptedException ex) {}
        }
        
        try {
            if(this.getName().equalsIgnoreCase("Thread-4")){//Los hilos deben acabar de forma ordenada. Para ello, a excepción del último hilo Thread-4, el resto serán ordenados mediante un join.
                
            } else {
                hilo.join();
            }
        } catch (InterruptedException ex) {}
        
        System.out.println("Fin del hilo: "+this.getName());
    }
}
