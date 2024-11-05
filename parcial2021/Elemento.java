import java.util.ArrayList;

public abstract class Elemento {

    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getVolumen();
    public abstract String getMarca();
    public abstract int getPrecio();
    public abstract int getCantProducto();
    public abstract ArrayList<Elemento> buscar(Condicion cond);

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
