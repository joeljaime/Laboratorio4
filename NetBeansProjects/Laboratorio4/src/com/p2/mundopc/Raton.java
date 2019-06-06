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
    public class Raton extends DispositivoEntrada {

    private static int idRaton;
    private static int contadorRatones;
    
  public Raton(String tipoEntrada, String marca) {
     super(tipoEntrada, marca);
     this.contadorRatones = ++contadorRatones;
 }

    public static int getIdRaton() {
        return ++idRaton;
    }

    public static void setIdRaton(int idRaton) {
        Raton.idRaton = idRaton;
    }

    public static int getContadorRatones() {
        return ++contadorRatones;
    }

    public static void setContadorRatones(int contadorRatones) {
        Raton.contadorRatones = contadorRatones;
    }
    
}
