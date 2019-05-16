/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagonalPrincipal;

/**
 *
 * @author jaime
 */
class Diagonal {
    int a;
    int b; 
    Diagonal ( int d1, int d2) {
        this.a = d1;
        this.b = d2;
    }
    int resultado () {
        return (Math.abs(a - b));
    }
}
