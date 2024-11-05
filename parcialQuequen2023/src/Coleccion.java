import java.util.ArrayList;
import java.util.Collections;

public class Coleccion extends Coleccionable{

	private ArrayList<Coleccionable> elms;
	private double extra = 0.1;
	
	public Coleccion(String nombre) {
		super(nombre);
		elms = new ArrayList<Coleccionable>();
	}

	
	
	public double getExtra() {
		return extra;
	}



	public void setExtra(double extra) {
		this.extra = extra;
	}



	public void addElemento(Coleccionable cc) {
		elms.add(cc);
	}
	
	
	public int getPeso() {
		int suma =0;
		for(Coleccionable cc : elms) {
			suma = suma + cc.getPeso();
		}
		return suma;
	}
	
	public double getVolumen() {
		double suma =0;
		for(Coleccionable cc : elms) {
			suma = suma + cc.getVolumen() ;
		}
		return suma + extra * this.getCantidadProductos();
	}
	
	public int getCantidadProductos() {
		int suma = 0;
		for(Coleccionable cc : elms) {
			
		   suma = suma + cc.getCantidadProductos();
		
		}
		return suma;
	}
	
	public ArrayList<String> getCaracteristicas(){
		ArrayList<String> suma = new ArrayList<String>();
		for(Coleccionable cc : elms) {
		  ArrayList<String> aux = cc.getCaracteristicas(); 	
		  for(String ss:aux) {
			  if (!suma.contains(ss)) {
				  suma.add(ss);
			  }
		  }
		
		}
		return suma;
	}
	
	public ArrayList<Producto> buscar(Condicion cc){
		ArrayList<Producto> salida = new ArrayList<Producto>();
		for(Coleccionable colec:elms) {
			//CORTA LA BUSQUEDA EN UN SOLO NIVEL
			//if (cc.cumple(colec)) {
			//	salida.add(colec);
			//}
			
			salida.addAll(colec.buscar(cc));
		}
		
		return salida;
	}
}
