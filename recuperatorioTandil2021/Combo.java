
import java.util.ArrayList;

public class Combo extends ElementoBazar {

    private ArrayList<String> categorias;
    private Condicion cond;
    private double descuento;
    private double descuentoMax;

    

    public Combo(Condicion cond, double descuento, double descuentoMax) {
        this.cond = cond;
        this.descuento = descuento;
        this.descuentoMax = descuentoMax;
        categorias = new ArrayList<>();
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoMax() {
        return descuentoMax;
    }

    public void setDescuentoMax(double descuentoMax) {
        this.descuentoMax = descuentoMax;
    }

    public void addElemento(){
        
    }

    @Override
    public double getPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
    }

    @Override
    public double getPeso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPeso'");
    }

    @Override
    public ArrayList<String> getCategorias() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCategorias'");
    }

    @Override
    public int getCantProductos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCantProductos'");
    }

    @Override
    public Producto getProductoMenor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductoMenor'");
    }

    @Override
    public ArrayList<ElementoBazar> buscar(Condicion cond) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public ElementoBazar getCopia(Condicion cond) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCopia'");
    }

}
