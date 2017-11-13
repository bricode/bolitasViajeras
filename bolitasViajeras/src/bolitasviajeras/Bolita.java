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
public class Bolita {
    boolean esLisa = true;
    float peso;
    float velocidad;
    
    public Bolita(boolean tipo, float peso, float velocidad) {
        this.esLisa = tipo;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public boolean isEsLisa() {
        return esLisa;
    }

    public void setEsLisa(boolean esLisa) {
        this.esLisa = esLisa;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
}