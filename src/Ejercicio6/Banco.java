/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Banco {
    int capital = 2500;//Cantidad inicial   
    static boolean ing = true, ext = true;
    //Durante las operaciones bancarias, las operaciones de extraccion e ingreso de capital no se pueden realizar al mismo tiempo.

    public synchronized int getDinero() { 
        //Mientras se ingresa dinero, no se puede extraer.
        while (ext == false) {
            try {
                ing = true;
                wait();
            } catch (Exception ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //No se puede extraer dinero que no se posee.
        if (capital <= 0) {
            ext = false;
            ing = true;
        }        
        notify();

        return capital;
    }

    public synchronized void setDinero(int ingreso) {
        try {
            //Mientras que se extrae dinero, no se puede ingresar.
            while (ing == false) {                
                ext = true;                
                wait();

            }//Ingreso es la variable que reflejará los cambios realizados en el capital.
            capital = ingreso;
            notify();

        } catch (Exception ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
