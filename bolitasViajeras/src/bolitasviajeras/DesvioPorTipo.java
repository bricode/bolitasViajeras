package bolitasviajeras;


/**
 *
 * @author edgar
 */
public class DesvioPorTipo extends Tramo{
    
    public DesvioPorTipo(Tramo salida1, Tramo salida2) {
		super(salida1, salida2);
		// TODO Auto-generated constructor stub
	}

	public Tramo next( Bolita bolita ) {
        if(bolita.esLisa) {
            return salida1;
        }else{
        	return salida2;
        }
    }

	@Override
	public float cuantoTarda(Bolita bolita) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
}

