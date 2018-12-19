/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

/**
 *
 * @author Marcos
 */
public class LiebrevsTortuga {
    public int posiciontortuga;//Las posiciones de los corredores. Empiezan en 0
    public int posicionliebre;
    
    public boolean turnotortuga = true;//Para asegurarse de que vayan simultaneos y un hilo no vaya muy adelante del otro
    public boolean turnoliebre = false;
    
    public static boolean fin = false;//Si la carrera a terminado
    
    public synchronized void carreratortuga (int movimiento, boolean avanceoresbalon) throws InterruptedException {//cantidad para ver cuanto avanzan o retroceden, avance o resbalon para ver si avanzan o retroceden, true para avance, false para resbalon
    
        while(turnoliebre == false){//Mientras es el turno de la tortuga no es el de la liebre
            wait();
            turnotortuga=true;
        }
        
        if (posiciontortuga<70){//La tortuga no corre si ya ganó
            if(turnotortuga==true){//Turno de la tortuga
                if (avanceoresbalon==false){//Si se resbala al principio avanza 1 casilla
                    if(posiciontortuga - movimiento <0){
                        posiciontortuga = 1;
                    }else{
                        posiciontortuga = posiciontortuga - movimiento;//Si resbala pero no es al principio, retrocede
                    }
                }else{
                    posiciontortuga = posiciontortuga + movimiento;//La tortuga avanza si no se resbala
                }
                
            }
        } else{
            System.out.println("VICTORIA DE LA TORTUGA!!");//Si la tortuga sobrepaso la linea de meta gano.
            fin = true;
        }
        
        System.out.println("Posicion de la tortuga"+posiciontortuga);//Posicion de la tortuga
        notify();//Notificacion de fin de turno
    }
    
    
        
     public synchronized void carreraliebre (int movimiento, boolean avanceoresbalon)throws InterruptedException {   
        while(turnotortuga == false){//No es el turno de la tortuga mientras es el de la liebre
            wait();
            turnoliebre=true;
            
        }
        
        if (posicionliebre<70){//La liebre no corre si ya ganó
            if (turnoliebre == true){//Turno de la liebre
                if (avanceoresbalon==false){//Si la liebre resbala al principio avanza una casilla
                    if (posicionliebre - movimiento <0){
                        posicionliebre = 1;
                    }else{
                        posicionliebre = posicionliebre - movimiento;//Si no se resbala al principio retrocede
                    }
                }else{
                    posicionliebre = posicionliebre + movimiento;//La liebre avanza si no se resbala(aunque se puede dormir pero eso lo cuento como si avanzara 0 casillas)
                }                
            }
        }else{
            System.out.println("VICTORIA DE LA LIEBRE!!");//Victoria de la liebre
            fin = true;
        }
        
       
       System.out.println("Posicion de la liebre: "+posicionliebre);//Posicion de la liebre
       notify();//Notificacion de fin de turno
}
    
    
}
