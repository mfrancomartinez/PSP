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
public class Hilos extends Thread{
    
    public int num = 0;
    public Hilos hilo;
    public int type;
    
    public Hilos(int type){            
            this.type = type;
            this.start();
    }
    
    @Override public void run() {
        
        switch(type){//Se crea un switch. Este servirá para diferenciar los distintos hilos.
            case 1: pares(); break;
            case 2: impares(); break;
            case 3: findosotres(); break;
        }       
        
    }    
    
    
    public void pares(){
        
        for(int i = 1; i <= 1000; i++){//Los numeros sobre los que se operará son del 1 al 1000 como se estipuló
            
            if (i % 2 == 0) {//El razonamiento tras el hilo de los pares es simple. Si un número es par, al dividirse por 2 su resto tiene que ser 0. Usando esa condición, se van sumando números en el bucle
                
                num = num + i;
            }
            
            System.out.println("La suma de todos los pares es: " + num);
            
            try {
                Thread.sleep((long) (Math.random() * 1000 + 500));//Tome los mismos parametros para las interrupciones, que decidí aleatoriamente
            } catch (InterruptedException ex) {
            }
        }
    }
    public void impares(){//En el caso de los impares es básicamente el mismo razonamiento que los pares, pero opuesto.
        
        for(int i = 1; i <= 1000; i++){
            
            if (i % 2 != 0) {
                
                num = num + i;
            }
            
            System.out.println("La suma de todos los impares es: "+ num);
            
            try {
                Thread.sleep((long) (Math.random() * 1000 + 500));
            } catch (InterruptedException ex) {
            }
        }
    }
    public void findosotres(){//En el caso de los que se terminan en dos o tres es más complicado.
        
        for(int i = 1; i <= 1000; i++){//Primero se recogen los numeros en un array.
            String[] array = String.valueOf(i).split("");
            
            if (Integer.parseInt(array[array.length -1]) == 2 || Integer.parseInt(array[array.length -1]) == 3) {//Despues dentro del bucle parseamos, para obtener los números y usando la longitud de la cifra en sí, elegimos la última cifra (array.lenght-1) y la igualamos a 2 o a 3. Si da coincidencia se suma.
                
                num = num + i;
            }
            
            System.out.println("La suma de los acabados en 2 o 3 es: " + num);
            
            try {
                Thread.sleep((long) (Math.random() * 1000 + 500));
            } catch (InterruptedException ex) {
            }
        }
    }
}
