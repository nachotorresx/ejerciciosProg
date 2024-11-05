package parcialTandil2024;
import java.time.LocalDate;

public class Venta {
    
    private LocalDate fecha;
    private String codigoProducto;
    private int dni;
    private int monto;
    private int cantidadVendida;
    
    public Venta(LocalDate fecha, String codigoProducto, int dni, int monto, int cantidadVendida) {
        this.fecha = fecha;
        this.codigoProducto = codigoProducto;
        this.dni = dni;
        this.monto = monto;
        this.cantidadVendida = cantidadVendida;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public int getGanacias(){
        return monto*cantidadVendida;
    }
    
}
