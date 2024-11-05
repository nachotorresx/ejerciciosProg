package prefinal2022;

import java.time.LocalDate;

public class NoticiaEspecial extends Noticia {

    private LocalDate fechaLimiteComentarios;

    public NoticiaEspecial(String titulo, String texto, String autor, String tema, LocalDate fechaLimiteComentarios) {
        super(titulo, texto, autor, tema);
        this.fechaLimiteComentarios = fechaLimiteComentarios;
    }

    @Override
    public void addComentario(Comentario comentario) {
        if (LocalDate.now().isBefore(fechaLimiteComentarios) || LocalDate.now().isEqual(fechaLimiteComentarios)) {
            super.addComentario(comentario);
        }
    }

    public LocalDate getFechaLimiteComentarios() {
        return fechaLimiteComentarios;
    }

    public Noticia copia(Condicion cond){
        if(cond.cumple(this)){
            return new NoticiaEspecial(this.getTitulo(), this.getTexto(), this.getAutor(), this.getTema(), this.fechaLimiteComentarios);
        }
        return null;
    }
}
