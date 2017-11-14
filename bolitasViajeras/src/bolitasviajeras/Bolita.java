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
    private boolean esLisa = true;
    private float peso;
    private float velocidad;
    private float tiempoRecorrido;
    
    public Bolita(boolean tipo, float peso, float velocidad, float tiempoRecorrido) {
        this.esLisa = tipo;
        this.peso = peso;
        this.velocidad = velocidad;
        this.tiempoRecorrido = tiempoRecorrido;
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

    public float getTiempoRecorrido() {
        return tiempoRecorrido;
    }

    public void setTiempoRecorrido(float tiempoRecorrido) {
        this.tiempoRecorrido = tiempoRecorrido;
    }
    
    
    
    public void sumaTiempoRecorrido(float segDetencion){
    	this.tiempoRecorrido =+ tiempoRecorrido;
    }
    
    
}