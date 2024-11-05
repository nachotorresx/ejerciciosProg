
public class CondicionPesoMenor extends Condicion {

	private int peso;
	
	public CondicionPesoMenor(int valor) {
		peso = valor;
	}
	@Override
	public boolean cumple(Coleccionable cc) {
		
		return cc.getPeso()<peso;
	}

}
