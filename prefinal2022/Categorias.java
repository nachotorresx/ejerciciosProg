package prefinal2022;

import java.util.ArrayList;

public class Categorias extends ElementoNoticia {

    private ArrayList<ElementoNoticia> elems;
    private int cantElems;

    public Categorias(int cantElems) {
        this.cantElems = cantElems;
        elems = new ArrayList<>();
    }

    public int getCantElems() {
        return cantElems;
    }

    public void setCantElems(int cantElems) {
        this.cantElems = cantElems;
    }

    public void addElemento(ElementoNoticia e){
        this.elems.add(e);
    }

    @Override
    public String getTema() {
        if (elems.size() >= cantElems) {
            return elems.get(cantElems - 1).getTema();
        } else if (elems.size() > 0) {
            return elems.get(0).getTema();
        }
        return null;
    }

    @Override
    public ElementoNoticia copia(Condicion cond) {
       Categorias copia = new Categorias(this.cantElems);
       boolean agrego = false;
        for (ElementoNoticia elem:elems){
            ElementoNoticia copiaHijo = elem.copia(cond);
            if (copiaHijo != null){
                copia.addElemento(copiaHijo);
                agrego = true;
            }
        }
        if (agrego) //if (copia.contarFotos()>0)
            return copia;
        else
            return null;
    }

    @Override
    public int cantNoticias(Condicion cond) {
       int suma = 0;
       for(ElementoNoticia elem:elems){
        suma += elem.cantNoticias(cond);
       }
       return suma;
    }
}
