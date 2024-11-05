import java.util.ArrayList;

public class Producto extends Coleccionable{

	
	private int peso;
	private double volumen;
	private ArrayList<String> caracteristicas;
	
	public Producto(String nombre, int peso, double volumen) {
		super(nombre);
		this.peso = peso;
		this.volumen = volumen;
		caracteristicas = new ArrayList<String>();
	}

	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public ArrayList<String> getCaracteristicas() {
	    
		return new ArrayList<String>(caracteristicas);
	}
	
	public void addCaracteristica(String carc) {
		if (!caracteristicas.contains(carc)) {
			caracteristicas.add(carc);
		}
	}

	public int getCantidadProductos() {
		return 1;
	}
	
	public ArrayList<Producto> buscar(Condicion cc){
		ArrayList<Producto> salida = new ArrayList<Producto>();
		if (cc.cumple(this)) {
			salida.add(this);
		}
		return salida;
	}
	
	
	
}
