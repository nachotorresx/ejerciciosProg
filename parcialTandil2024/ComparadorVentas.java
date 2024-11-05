package parcialTandil2024;

import java.util.Comparator;

public class ComparadorVentas implements Comparator<ElementoVentas>{

    @Override
    public int compare(ElementoVentas v1, ElementoVentas v2) {
        int result = 0;
        result = v1.getCantidadVentas() - v2.getCantidadVentas();
        return result;
    }
}
