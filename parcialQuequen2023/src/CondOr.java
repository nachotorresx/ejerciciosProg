
public class CondOr extends Condicion {


	Condicion c1, c2;
	public boolean cumple(Coleccionable cc) {
		// TODO Auto-generated method stub
		return c1.cumple(cc) || c2.cumple(cc);
	}
	
	

}
