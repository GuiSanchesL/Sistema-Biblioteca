package Test;

import DoMain.Autor;
import DoMain.Biblioteca;
import DoMain.Endereco;
import DoMain.Livro;

public class Gerenciador {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Nova Cidade ", "Rua odete Sampaio");
        Autor autor = new Autor("Visconde Sabugosa", "Brasileiro");
        Livro livro1 = new Livro("Sitio do picapau amarelo", 2000);
        Livro livro2 = new Livro("Senhor dos aneis ", 2000);
        Livro[] livros = {livro1, livro2};
        Biblioteca biblioteca = new Biblioteca("Campus de Leitura UFF");
        biblioteca.setEndereco(endereco);
        biblioteca.setLivros(livros);
        livro1.setBiblioteca(biblioteca);
        livro1.setAutor(autor);
        livro2.setBiblioteca(biblioteca);
        livro2.setAutor(autor);
        autor.setLivros(livros);
        biblioteca.imprime();
    }
}
