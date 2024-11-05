package parcialTandil2024;
import java.util.ArrayList;

public class Equipos extends ElementoVentas{
    
    private ArrayList<ElementoVentas> elems;
    
    public Equipos() {
        elems = new ArrayList<>(elems);
    }

    @Override
    public int getCantidadVentas() {
        int suma = 0;
        for(ElementoVentas e:elems){
           suma += e.getCantidadVentas();
        }
        return suma;
    }

    @Override
    public int getCantidadProductos() {
        int suma = 0;
        for(ElementoVentas e:elems){
            suma += e.getCantidadProductos();
        }
        return suma;
    }

    @Override
    public double getGanancias() {
        double suma = 0;
        for(ElementoVentas e:elems){
            suma += e.getGanancias();
        }
        return suma;
    }

    @Override
    public int getEdad() {
        int suma = 0;
        for(ElementoVentas e:elems){
            suma += e.getEdad();
        }
        if (elems.size()>0)
		   return suma/elems.size();
		else {
			return 0;
		}
    }

    @Override
    public ArrayList<VendedorIndividual> buscar(Condicion cond) {
        ArrayList<VendedorIndividual> salida = new ArrayList<VendedorIndividual>();
        for(ElementoVentas e:elems){
            ElementoVentas aux = e;
            salida.addAll(aux.buscar(cond));
        }
        return salida;
    }
}
