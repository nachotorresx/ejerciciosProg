import java.util.ArrayList;
import java.util.Collections;

public class ProductoPromocional extends Producto {

	private double descuento = 0.3;
	public ProductoPromocional(String nombre, int peso, double volumen) {
		super(nombre, peso, volumen);
		// TODO Auto-generated constructor stub
	}
	

	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public ArrayList<Producto> buscar(Condicion cc){
		ArrayList<Producto> salida = new ArrayList<Producto>();
		salida.add(this);
		return salida;
	}
	
	public double getCosto() {
		double valor = super.getCosto();
		return valor - valor *descuento;
	}
	
}
