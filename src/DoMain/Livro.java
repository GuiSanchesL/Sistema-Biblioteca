package DoMain;

public class Livro {
    private String titulo;
    private int anopublicado;
    private Biblioteca biblioteca;
    private Autor autor;
    public Livro( String titulo,int anopublicado) {
        this.titulo = titulo;
        this.anopublicado = anopublicado;

    }
    public Livro(String titulo, int anopublicado, Biblioteca biblioteca ) {
        this.anopublicado = anopublicado;
        this.biblioteca = biblioteca;
        this.titulo = titulo;
    }

    public Livro( String titulo,Autor autor, int anopublicado,  Biblioteca biblioteca) {
        this.anopublicado = anopublicado;
        this.autor = autor;
        this.biblioteca = biblioteca;
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
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
