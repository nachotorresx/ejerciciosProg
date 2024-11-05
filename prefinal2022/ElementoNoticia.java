package prefinal2022;

public abstract class ElementoNoticia {

    public abstract String getTema();
    public abstract ElementoNoticia copia(Condicion cond);
    public abstract int cantNoticias(Condicion cond);
}
