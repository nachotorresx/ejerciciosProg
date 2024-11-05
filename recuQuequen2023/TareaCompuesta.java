import java.util.ArrayList;

public class TareaCompuesta extends ElementoActividad {

    private ArrayList<ElementoActividad> especialidades;
    private int tiempoExtra;

    public TareaCompuesta(int tiemproExtra) {
        this.tiempoExtra = tiemproExtra;
        especialidades = new ArrayList<>();
    }

    public int getTiempoExtra() {
        return tiempoExtra;
    }

    public void setTiempoExtra(int tiempoExtra) {
        this.tiempoExtra = tiempoExtra;
    }

    @Override
    public double getCosto() {
       int suma = 0;
       for(ElementoActividad elem:especialidades){
            suma += elem.getCosto();
       }
       return suma;
    }

    @Override
    public int getTiempo() {
        int suma = 0;
        for(ElementoActividad elem:especialidades){
            suma += elem.getTiempo() + tiempoExtra;
        }
        return suma;
    }

    @Override
    public ArrayList<String> getAcciones() {
        ArrayList<String> salida = new ArrayList<>();
        for(ElementoActividad elem:especialidades){
            salida.addAll(elem.getAcciones());
        }
        return salida;
    }

    public void addElemento(ElementoActividad e){
        this.especialidades.add(e);
    }
}
