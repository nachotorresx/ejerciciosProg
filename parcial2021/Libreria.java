
import java.util.ArrayList;

public class Libreria {

    private ArrayList<Elemento> elems;
    private Condicion cond;

    public Libreria(Condicion cond) {
        this.cond = cond;
        elems = new ArrayList<>();
    }

    public boolean sePublicita(){
        ArrayList<Elemento> aux = new ArrayList<>(elems);
        for(Elemento e:aux){
            if(cond.cumple(e)){

            }
        }
    }
    
}
