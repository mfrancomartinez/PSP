/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Tortuga extends Thread{
    
    LiebrevsTortuga batalla;

    public Tortuga(LiebrevsTortuga batalla) {
        this.batalla = batalla;
    }
    
    @Override
    public void run(){
        System.out.println("Turno de la tortuga");//Empieza el turno de la tortuga
        
        
        while( batalla.fin == false){//La tortuga no corre si ya acabo la carrera
            try{
                Thread.sleep(1000); //1 segundo entre tiempos
                
                int tirardados = (int)(Math.random()*100+1);//Se tiran los dados y se calculan las posibilidades
                
                if(tirardados<=50){//50% -> +3 casillas
                    System.out.println("La tortuga avanza a gran velocidad!!!  Avanza 3 casillas");
                    batalla.carreratortuga(3, true);
                    
                }else if(tirardados>50 && tirardados<=70){//20% -> -6 casillas
                    System.out.println("La tortuga se resbala y pierde posición!! Retrocede 6 casillas");
                    batalla.carreratortuga(6, false);
                }else if(tirardados>70 && tirardados<=100){//30%-> +1 casilla
                    System.out.println("La tortuga avanza lentamente!!   Avanza 1 casilla");
                    batalla.carreratortuga( 1, true);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
