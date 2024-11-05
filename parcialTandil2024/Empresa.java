package parcialTandil2024;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa {

    private ArrayList<ElementoVentas> vendedores;
    private ComparadorVentas ordenador;
    
    public ComparadorVentas getOrdenador() {
        return ordenador;
    }

    public void setOrdenador(ComparadorVentas ordenador) {
        this.ordenador = ordenador;
    }

    public Empresa(ComparadorVentas ordenador) {
        this.ordenador = ordenador;
        vendedores = new ArrayList<>(vendedores);
    }

    public ArrayList<ElementoVentas> getRanking(){
        ArrayList<ElementoVentas> salida = new ArrayList<>(vendedores);
        Collections.sort(salida, ordenador);
        return salida;
    }
}
