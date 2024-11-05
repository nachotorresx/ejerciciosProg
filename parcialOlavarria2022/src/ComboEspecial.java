
public class ComboEspecial extends Combo {

	Condicion aceptacion;
	
	
	public ComboEspecial(int descuento) {
		super(descuento);
		
	}

	
	public void addElemento(ElemLad el) {
      
		if (aceptacion.cumple(el)) {
			super.addElemento(el);
		}
	}


	public Condicion getAceptacion() {
		return aceptacion;
	}


	public void setAceptacion(Condicion aceptacion) {
		this.aceptacion = aceptacion;
	}


	public ComboEspecial(int descuento, Condicion aceptacion) {
		super(descuento);
		this.aceptacion = aceptacion;
	}
	
	//ESTO ESTA MAL
	/*
	public void addElemento(ElemLad el, Condicion cc) {
	      
		if (cc.cumple(el)) {
			super.addElemento(el);
		}
	}*/
	
	
	
}
