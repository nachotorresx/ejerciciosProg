package parcialTandil2024;

import java.util.ArrayList;

public abstract class ElementoVentas {

    public abstract int getCantidadVentas();
    public abstract int getCantidadProductos();
    public abstract double getGanancias();
    public abstract int getEdad();

    public abstract ArrayList<VendedorIndividual> buscar(Condicion cond);
}
