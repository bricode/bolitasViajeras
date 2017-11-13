/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolitasviajeras;

/**
 *
 * @author edgar
 */
public abstract class Tramo {
    Tramo salida1 = null;
    Tramo salida2 = null;
    
    public Tramo(Tramo salida1, Tramo salida2) {
        this.salida1 = salida1;
        this.salida2 = salida2;
    }
    
    public abstract float cuantoTarda( Bolita bolita);
    
    public abstract Tramo next( Bolita bolita );
}
