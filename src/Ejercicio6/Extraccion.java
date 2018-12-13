/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

/**
 *
 * @author Marcos
 */
public class Extraccion extends Thread{
    Banco banco;
    int extraccion;
    
    public Extraccion(Banco banco){
    this.banco = banco;
    }
    
    public void run(){
    
        for (int i = 0; i < 5; i++) {//El numero de extracciones es 5
            extraccion = (int) (Math.random() * 1500 + 1);//No se especificó la cantidad que extraer cada vez, por lo tanto se usa aleatorio.
            banco.setDinero(banco.getDinero()-extraccion);//La cantidad nueva es igual a la cantidad anterior menos la cantidad retirada.
            System.out.println("El importe retirado al total es: "+extraccion);
            System.out.println("El importe total es: "+banco.getDinero());
        }
    }
}
