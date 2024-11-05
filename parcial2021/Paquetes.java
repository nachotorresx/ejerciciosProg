import java.util.ArrayList;

public class Paquetes extends Elemento {

    private ArrayList<Elemento> elems;

    public Paquetes(String nombre){
        super(nombre);
        elems = new ArrayList<>();
    }

    @Override
    public double getVolumen() {
        double mayor = 0;
        for(Elemento e:elems){
            double aux = e.getVolumen();
            if(aux > mayor){
                mayor = aux;
            }
        }
        return mayor;
    }

    @Override
    public String getMarca() {

        if(elems != null){
        return elems.get(0).getMarca();
        }
        return null;
    }

    @Override
    public int getPrecio() {
       int suma = 0;
       for(Elemento e:elems){
        suma += e.getPrecio();
       }
       return suma;
    }

    @Override
    public int getCantProducto() {
       int suma = 0;
       for(Elemento e:elems){
        suma += e.getCantProducto();
       }
       return suma;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion cond) {
        ArrayList<Elemento> salida = new ArrayList<>();
        if(cond.cumple(this)){
            salida.add(this);
        }
        for(Elemento e:elems){
            salida.addAll(e.buscar(cond));
        }
        return salida;
    }
}
