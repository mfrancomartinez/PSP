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
public class Buzon {

    String mensaxe = "";//El mensaje a escribir o leer
    boolean existemensaxe = false;//Boolean que nos puntua si el mensaje existe o no

    public synchronized void escribirmensaje(String mensaje) throws InterruptedException {//El synchronized debe estar, puesto que estos dos métodos siguientes estarán actuando en tiempo real sobre mensaje y existemensaje.
        while (existemensaxe == true) {//Mientras el mensaje exista, no se puede escribir otro
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
            }
            notifyAll();
            this.mensaxe = mensaxe;//Se escribe el mensaje que pongamos, y cambiamos el boolean a true(existe mensaje)
            existemensaxe = true;
        }
    }

    public synchronized String lermensaxe() throws InterruptedException {
        try {
            wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
        }
        notifyAll();
        existemensaxe = true;//El mensaje existe, se lee
        return mensaxe;

    }
}
