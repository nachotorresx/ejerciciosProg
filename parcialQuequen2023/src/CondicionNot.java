
public class CondicionNot extends Condicion {

	Condicion cond;
	public CondicionNot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cumple(Coleccionable cc) {
		// TODO Auto-generated method stub
		return ! cond.cumple(cc);
	}

}
