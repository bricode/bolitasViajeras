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
public class DesvioPorPeso extends Tramo{
    
    private float pesoSoportado;
    
    public DesvioPorPeso(float pesoSoportado,Tramo salida1, Tramo salida2) {
        super(salida1, salida2);
        this.pesoSoportado = pesoSoportado;
    }

    @Override
    public float cuantoTarda(Bolita bolita) {
        return 0;
    }

    @Override
    public Tramo next(Bolita bolita) {
        if(bolita.getPeso() < this.pesoSoportado) {
            return salida1;
        }
        else {
            return salida2;
        }
    }

    public float getPesoSoportado() {
        return pesoSoportado;
    }

    public void setPesoSoportado(float pesoSoportado) {
        this.pesoSoportado = pesoSoportado;
    }
    
    
}
