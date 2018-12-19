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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     LiebrevsTortuga batalla = new LiebrevsTortuga();//Inicia la carrera
     
     Tortuga tortuga = new Tortuga(batalla);//Se colocan los corredores
     Liebre liebre = new Liebre(batalla);
     
     liebre.start();//La liebre comienza a correr
     tortuga.start();//La tortuga comienza a correr
     
    }
    
}
