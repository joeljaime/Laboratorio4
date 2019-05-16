/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio03;

/**
 *
 * @author jaime
 */
class Entrenador {
    private int idEntrenador;
    private String nombre;
    private String tipo;
    static int contadorEntrenadores;
    
    
    Entrenador (String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.idEntrenador = contadorEntrenadores++;
    }
public String getNombre(){
    return nombre;
}
public String getTipo(){
    return tipo;
}
public void setNombre(String nombre ){
    this.nombre = nombre;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
    
}

}
