package DoMain;

public class Livro {
    private String titulo;
    private int anopublicado;

    public Livro(int anopublicado, String titulo) {
        this.anopublicado = anopublicado;
        this.titulo = titulo;
    }

    public int getAnopublicado() {
        return anopublicado;
    }

    public void setAnopublicado(int anopublicado) {
        this.anopublicado = anopublicado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
