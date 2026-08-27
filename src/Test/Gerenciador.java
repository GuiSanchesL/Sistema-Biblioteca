package Test;

import DoMain.Autor;
import DoMain.Biblioteca;
import DoMain.Endereco;
import DoMain.Livro;

public class Gerenciador {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Nova Cidade ","Rua odete Sampaio");
        Autor autor = new Autor("Visconde Sabugosa","Brasileiro");
        Livro livro = new Livro("Sitio do picapau amarelo",2000);
        Livro [] livros= {livro};
        Biblioteca biblioteca = new Biblioteca("Campus de Leitura UFF");
        biblioteca.setEndereco(endereco);
        biblioteca.setLivros(livros);
        livro.setBiblioteca(biblioteca);
        livro.setAutor(autor);
        autor.setLivros(livros);
biblioteca.imprime();
    }
}
