import java.util.ArrayList;
import java.util.Collections;

public class Pieza extends ElemLad{

	String color;
	double costo;
	int encastres;
	double peso;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getEncastres() {
		return encastres;
	}
	public void setEncastres(int encastres) {
		this.encastres = encastres;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public  ArrayList<ElemLad> buscar(Condicion cc){
        ArrayList<ElemLad> salida = new ArrayList<ElemLad>();
		if (cc.cumple(this)) {
			salida.add(this);
		}
        
		return salida;
	};
	
	
}
