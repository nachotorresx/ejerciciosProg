

import java.util.ArrayList;

public abstract class ElementoBazar {

    public abstract double getPrecio();
    public abstract double getPeso();
    public abstract ArrayList<String> getCategorias();
    public abstract int getCantProductos();
    public abstract Producto getProductoMenor();
    public abstract ArrayList<ElementoBazar> buscar(Condicion cond);
    public abstract ElementoBazar getCopia(Condicion cond);
    
}
