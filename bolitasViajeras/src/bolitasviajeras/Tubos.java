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
public class Tubos extends Tramo{
    float longitud;
    
    public Tubos(Tramo salida1, Tramo salida2, float longitud) {
        super(salida1, salida2);
        this.longitud = longitud;
    }
    
    
    public float cuantoTarda(Bolita bolita) {
        float tiempo = this.longitud / bolita.getVelocidad();
        
        System.out.println("La bolita tarda: " +  tiempo);
        return tiempo;
    }

    @Override
    public Tramo next(Bolita bolita) {
        return salida1;
    }    
}
