package bolitasviajeras;

public class Detencion extends Tramo {
	
	public float segDetencion;

	public Detencion(float segDetencion, Tramo salida1, Tramo salida2) {
		super(salida1, salida2);
		this.segDetencion = segDetencion;
	}
	
	@Override
	public float cuantoTarda(Bolita bolita) {
		return 0;
	}

	@Override
	public Tramo next(Bolita bolita) {
		bolita.sumaTiempoRecorrido(this.segDetencion);
		return salida1;
	}

}