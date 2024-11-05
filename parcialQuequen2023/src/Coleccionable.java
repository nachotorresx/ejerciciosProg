import java.util.ArrayList;

public abstract class Coleccionable {
	private String nombre;
	
	private static double costoIndividual=1;
	private static double precioGramo=10;
	
	public String getNombre() {
		return nombre;
	
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Coleccionable(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public abstract int getPeso();
	public abstract double getVolumen();
	
	public abstract int getCantidadProductos();
	
	public abstract ArrayList<String> getCaracteristicas();
	
	public abstract ArrayList<Producto> buscar(Condicion cc);
	

	public double getCosto() {
		return this.getCantidadProductos() * Coleccionable.getCostoIndividual() +
				this.getPeso() * Coleccionable.getPrecioGramo();
	}

	public static double getCostoIndividual() {
		return costoIndividual;
	}

	public static void setCostoIndividual(double costoIndividual) {
		Coleccionable.costoIndividual = costoIndividual;
	}

	public static double getPrecioGramo() {
		return precioGramo;
	}

	public static void setPrecioGramo(double precioGramo) {
		Coleccionable.precioGramo = precioGramo;
	};
	
	
}
