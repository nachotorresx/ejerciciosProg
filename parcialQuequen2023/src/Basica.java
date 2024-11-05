
public class Basica extends Coleccion {

   Condicion condicion;
   
	public Basica(String nombre, Condicion cc) {
		super(nombre);
		condicion = cc;

	}

	public void addElemento(Coleccionable ee) {
		if (condicion.cumple(ee)) {
			super.addElemento(ee);
		}
		
	}
}
