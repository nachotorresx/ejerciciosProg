package parcialTandil2024;
import java.util.ArrayList;

public class VendedorIndividual extends ElementoVentas {

    private String nombre;
    private String apellido;
    private int edad;
    private ArrayList<Venta> ventas;

    
    
    public VendedorIndividual(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        ventas = new ArrayList<>(ventas);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadVentas() {
        return ventas.size();
    }

    @Override
    public int getCantidadProductos() {
        int suma = 0;
        for(Venta e:ventas){
            suma += e.getCantidadVendida();
        }
        return suma;
    }

    @Override
    public double getGanancias() {
        double suma = 0;
        for(Venta e:ventas){
            suma += e.getGanacias();
        }
        return suma;
    }

    @Override
    public ArrayList<VendedorIndividual> buscar(Condicion cond) {
        ArrayList<VendedorIndividual> salida = new ArrayList<VendedorIndividual>();
            if(cond.cumple(this)){
                salida.add(this);
            }
            return salida;
    }
}
