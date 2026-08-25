package DoMain;

public class Biblioteca {
    private String nome;
    private Livro [] livros;
    private Endereco endereco;
    public Biblioteca(String nome) {
        this.nome = nome;
    }
    public Biblioteca(String nome,Livro[] livros) {
        this.livros = livros;
        this.nome = nome;
    }

    public Biblioteca(Endereco endereco, Livro[] livros, String nome) {
        this.endereco = endereco;
        this.livros = livros;
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
