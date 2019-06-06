/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p2.mundopc;

/**
 *
 * @author jaime
 */
    public class Teclado extends DispositivoEntrada {

    private static int idTeclado;
    private static int contadorTeclados;
    

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
      this.idTeclado = idTeclado;
        this.contadorTeclados = ++contadorTeclados;
    }

    public static int getIdTeclado() {
        return ++idTeclado;
    }

    public static void setIdTeclado(int idTeclado) {
        Teclado.idTeclado = idTeclado;
    }

    public static int getContadorTeclados() {
        return ++contadorTeclados;
    }

    public static void setContadorTeclados(int contadorTeclados) {
        Teclado.contadorTeclados = contadorTeclados;
    }
    
    @Override
    public String toString() {
        return "{Id: "+getIdTeclado()+ ", Tipo: " + getTipoEntrada() + ", Marca: " + getMarca() + '}';
    }

}

