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
public class Entrenador {
    
    String nombre ;
    String tipo;
    public Entrenador (){
        
    }
public Entrenador(String nombre, String tipo){
    this.nombre = nombre;
    this.tipo = tipo;
}
public void setEntrenador(String nombre, String tipo){
    this.nombre = nombre;
    this.tipo = tipo;
}
public void entrenamiento(){
    System.out.println("Mi nombre es:" +this.nombre+ " y soy entrenador de :"+this.tipo);
 
    }


}
