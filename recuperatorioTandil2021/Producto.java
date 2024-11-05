

import java.util.ArrayList;

public class Producto extends ElementoBazar {

    private ArrayList<String> categorias;
    private double precio;
    private double peso;

    
    public Producto(double precio, double peso) {
        this.precio = precio;
        this.peso = peso;
        categorias = new ArrayList<>();
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public double getPeso() {
       return peso;
    }

    @Override
    public ArrayList<String> getCategorias() {
        return new ArrayList<>(categorias);
    }
    
    public void addCategoria(String categoria){
        this.categorias.add(categoria);
    }

    @Override
    public int getCantProductos() {
        return 1;
    }

    @Override
    public Producto getProductoMenor() {
        Producto menor = new Producto(this.precio, this.peso);
       return menor;
    }

    @Override
    public ArrayList<ElementoBazar> buscar(Condicion cond) {
        ArrayList<ElementoBazar> salida = new ArrayList<>();
            if(cond.cumple(this)){
                salida.add(this);
            }
        return salida;
    }

    @Override
    public ElementoBazar getCopia(Condicion cond) {
        if (cond.cumple(this)) {
            Producto copia = new Producto(this.peso, this.precio);
            for (String categoria : categorias)
                copia.addCategoria(categoria);
            return copia;
        }
        return null;
    }

}
