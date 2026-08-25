package DoMain;

public class Autor {
    private String nome;
    private String nacionalidade;
    private Livro[] livros;

    public Autor(String nacionalidade, String nome) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }

    public Autor(String nome,String nacionalidade, Livro[] livros) {
        this.livros = livros;
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
