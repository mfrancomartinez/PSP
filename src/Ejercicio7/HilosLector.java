/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class HilosLector extends Thread{
    Buzon buzon;
    int id;//Numero del hilo lector

    public HilosLector(Buzon buzon, int id) {
        this.buzon = buzon;
        this.id = id;
    }
    
    public void run(){
        try {
            System.out.println("El lector"+id+" está leyendo el mensaje: "+buzon.lermensaxe());
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosLector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
