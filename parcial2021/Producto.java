import java.util.ArrayList;

public class Producto extends Elemento {

    private String marca;
    private int precio;
    private double volumen;
    
    public Producto(String nombre, String marca, int precio, double volumen) {
        super(nombre);
        this.marca = marca;
        this.precio = precio;
        this.volumen = volumen;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public int getCantProducto() {
        return 1;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion cond) {
        ArrayList<Elemento> salida = new ArrayList<>();
       if(cond.cumple(this)){
            salida.add(this);
       }
       return salida;
    }
}
