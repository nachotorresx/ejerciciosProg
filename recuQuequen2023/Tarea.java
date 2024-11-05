import java.util.ArrayList;

public class Tarea extends ElementoActividad {
    
    private String acciones;
    private double costo;
    private int tiempo;

    public Tarea(String acciones, double costo, int tiempo) {
        this.acciones = acciones;
        this.costo = costo;
        this.tiempo = tiempo;
    }

    public ArrayList<String> getAcciones() {
        ArrayList<String> salida = new ArrayList<>();
            salida.add(acciones);
        return salida;
    }
    public void setAccion(String acciones) {
        this.acciones = acciones;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

}
