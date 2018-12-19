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
public class HilosEscritor extends Thread{
    Buzon buzon;
    String mensaxe;
    int id;

    public HilosEscritor(Buzon buzon, String mensaxe, int id) {
        this.buzon = buzon;//Importaremos los metodos de buzon para escribir
        this.mensaxe = mensaxe;//El mensaje que se escribe
        this.id = id;//Variable para indicar que escritor es, ya que vamos a hacer varios
    }
    
    @Override
    public void run(){       
        try {
            buzon.escribirmensaje(mensaxe);//Se escribe el mensaje
            System.out.println("Mensaje escrito por escritor nº:"+id);//Notificacion de que se escribio el mensaje
        } catch (InterruptedException ex) {
            Logger.getLogger(HilosEscritor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
}
