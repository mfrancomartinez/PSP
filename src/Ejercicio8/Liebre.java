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
public class Liebre extends Thread{
    LiebrevsTortuga batalla;

    public Liebre(LiebrevsTortuga batalla) {
        this.batalla = batalla;
    }
    
    @Override
    public void run(){
        System.out.println("Turno de la liebre");//Empieza el turno e la liebre
        
        while(batalla.fin == false){//La liebre no corre si ya acabo la carrera
            try{
                Thread.sleep(1000);//Existe un espacio de 1 segundo entre turnos
                int tirardados = (int)Math.random()*100+1;//Se tiran los dados (Se calcula el porcentaje de posibilidad)
                
                if(tirardados<=20){//20% de posibilidades -> La liebre duerme
                    System.out.println("... Por que la liebre está durmiendo?");
                    batalla.carreraliebre(0, true);
                }else if(tirardados>20 && tirardados<= 40){//20% de posibilidades -> La liebre salta y avanza 9 casillas
                    System.out.println("La liebre pega un gran salto!!  Avanza 9 casillas");
                    batalla.carreraliebre(9, true);
                }else if(tirardados>40 && tirardados<=50){//10% de posibilidades -> La liebre resbala y retrocede 12 casillas
                    System.out.println("Menudo resbalón!!! La liebre pierde mucha posicion.  Retrocede 12 casillas");
                    batalla.carreraliebre(12, false);
                }else if(tirardados>50 && tirardados<=80){//30% de posiblidades -> La liebre avanza lentamente 1 casilla
                    System.out.println("La liebre pega un pequeño salto!!   Avanza 1 casilla");
                    batalla.carreraliebre(1, true);
                }else if(tirardados>80 && tirardados<= 100){//20 % de posibilidades -> La liebre resbala 2 casillas.
                    System.out.println("La liebre resbala pero se recupera rapidamente!!   Retrocede 2 casillas");
                    batalla.carreraliebre(2, false);
                }
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Liebre.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
