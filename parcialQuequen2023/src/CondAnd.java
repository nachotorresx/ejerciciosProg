
public class CondAnd extends Condicion {


	Condicion c1, c2;
	
	public CondAnd(Condicion cc, Condicion cc2) {
	  c1=cc;
	  c2=cc2;
	}
	public boolean cumple(Coleccionable cc) {
		// TODO Auto-generated method stub
		return c1.cumple(cc) && c2.cumple(cc);
	}

	
public static void main(String[]args) {
	CondicionPesoMenor pp = new CondicionPesoMenor(40);
	CondicionCarcteritica cc = new CondicionCarcteritica("Mattel");
	CondicionCarcteritica cc2 = new CondicionCarcteritica("HotWheels");
	CondAnd cor = new CondAnd(cc,cc2);
	
}
}
