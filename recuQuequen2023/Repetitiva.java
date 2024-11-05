
import java.util.ArrayList;

public class Repetitiva extends TareaCompuesta {

    private int indicador;

    public Repetitiva(int tiempoExtra, int indicador){
        super(tiempoExtra);
        this.indicador = indicador;
    }

    public int getIndicador() {
        return indicador;
    }

    public void setIndicador(int indicador) {
        this.indicador = indicador;
    }

    public ArrayList<String> getAcciones(){
        ArrayList<String> accionesPadre = new ArrayList<>(super.getAcciones());
        ArrayList<String> salida = new ArrayList<>();
        for(int i = 0; i < indicador; i++){
            salida.addAll(accionesPadre);
        }
        return salida;
    }

    public double getCosto(){
        double suma = 0;
        suma += super.getCosto() * indicador;
        return suma;
    }

    public int getTiempo(){
        int suma = 0;
        suma += super.getTiempo() * indicador;
        return suma;
    }
    
}
