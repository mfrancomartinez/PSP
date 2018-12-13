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
public class Ingreso extends Thread{    
    Banco banco;
    int ingreso;

    
    public Ingreso(Banco banco) {
        this.banco = banco;
    }

    public void run() {        
        for (int i = 0; i < 10; i++) {//Hay que realizar 10 ingresos            
            ingreso = (int) (Math.random() * 1500 + 1);//No se estipula la cantidad de dinero que se debe ingresar pero para que sea variable, usamos el aleatorio. 
            banco.setDinero(banco.getDinero()+ingreso);//La nueva cantidad es igual a la anterior más la añadida tras el ingreso.
            System.out.println("El importe añadido al total es:  "+ingreso);
            System.out.println("El importe total es: "+banco.getDinero());
        }
    }
}
