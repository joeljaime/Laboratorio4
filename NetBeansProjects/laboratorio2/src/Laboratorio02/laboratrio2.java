/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio02;

/**
 *
 * @author jaime
 */
public class laboratrio2 {
    public static void main(String[] args) {
        Entrenador  entrenador1= new Entrenador();
        entrenador1.setEntrenador("Marco", "Futbol");
        entrenador1.entrenamiento();
        System.out.println("La variable entrenador1: "+entrenador1);
   
      Entrenador  entrenador2= new Entrenador();  
    entrenador2.setEntrenador("Jose", "Basquet");
    entrenador2.entrenamiento();
    System.out.println("La variable entrenador2: "+entrenador2);
    
    }
}
