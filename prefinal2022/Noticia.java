package prefinal2022;

import java.util.ArrayList;

public class Noticia extends ElementoNoticia {
    
    private String titulo;
    private String texto;
    private String autor;
    private String tema;
    private ArrayList<Comentario> comentarios;

    
    public Noticia(String titulo, String texto, String autor, String tema) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.tema = tema;
        comentarios = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String getTema() {
        return tema;
    }

    public void addComentario(Comentario com){
        this.comentarios.add(com);
    }

    @Override
    public Noticia copia(Condicion cond) {
        if(cond.cumple(this)){
            Noticia copia = new Noticia(this.titulo, this.texto, this.autor, this.tema);
            for (Comentario com : comentarios)
                copia.addComentario(com);
            return copia;
        }
        return null;
    }

    @Override
    public int cantNoticias(Condicion cond) {
        if(cond.cumple(this)){
            return 1;
        }
        return 0;
    }
}
