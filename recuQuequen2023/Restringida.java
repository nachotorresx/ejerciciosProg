public class Restringida extends TareaCompuesta {

    private Condicion cond;

    public Restringida(int tiempoExtra, Condicion cond) {
        super(tiempoExtra);
        this.cond = cond;
    }

    public void setCond(Condicion cond) {
        this.cond = cond;
    }

    public void addElemento(ElementoActividad e){
        if(cond.cumple(e))
            super.addElemento(e);
    }
}
