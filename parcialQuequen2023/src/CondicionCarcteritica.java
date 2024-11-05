
public class CondicionCarcteritica extends Condicion {

	private String buscada;
	public CondicionCarcteritica(String ss) {
		super();
		buscada =ss;
	}


	public boolean cumple(Coleccionable cc) {
		// TODO Auto-generated method stub
		return cc.getCaracteristicas().contains(buscada);
	}

	
}
