package bolitasviajeras;

/**
 *
 * @author edgar
 */
public class Bolita {
    boolean esLisa = true;
    float peso;
    float velocidad;
    float tiempoRecorrido;
    
    
    public Bolita(boolean tipo, float peso, float velocidad, float tiempoRecorrido) {
        this.esLisa = tipo;
        this.peso = peso;
        this.velocidad = velocidad;
        this.tiempoRecorrido= tiempoRecorrido;
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
    
    public void sumaTiempoRecorrido(float segDetencion){
    	this.tiempoRecorrido =+ tiempoRecorrido;
    }
    
}