/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author Marcos
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Buzon buzon = new Buzon();
     HilosEscritor escritor1 = new HilosEscritor(buzon, "Hola", 1);//Se instancian los escritores.
     HilosEscritor escritor2 = new HilosEscritor(buzon, "Adiós", 2);
     
     HilosLector lector1 = new HilosLector(buzon, 1);//Se instancian los lectores
     HilosLector lector2 = new HilosLector(buzon, 2);
     
     escritor1.start();//Se inician los escritores;
     escritor2.start();
     
     lector1.start();//Se inician los lectores;
     lector2.start();
     
    }
    
}
