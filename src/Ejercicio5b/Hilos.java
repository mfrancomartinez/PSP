/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5b;

/**
 *
 * @author Marcos
 */
public class Hilos extends Thread{
   public int num;

    public Hilos(int num) {
        this.num = num;
    }

    @Override public void run() {
        
        
        System.out.println("Ola, son o fío numero" + num);

    }
}
