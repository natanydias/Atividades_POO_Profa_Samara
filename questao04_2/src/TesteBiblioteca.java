public class TesteBiblioteca {
    public static void main(String[] args) {
        // Criando uma biblioteca com capacidade para 5 livros
        Biblioteca biblioteca = new Biblioteca(5);

        // Criando e adicionando 3 livros
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien");
        Livro livro3 = new Livro("1984", "George Orwell");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Mostrando os livros cadastrados
        biblioteca.mostrarLivros();

        // Empréstimo de um livro
        biblioteca.emprestarLivro("O Hobbit");

        // Devolução do mesmo livro
        biblioteca.devolverLivro("O Hobbit");

        // Mostrar novamente o estado de todos os livros
        biblioteca.mostrarLivros();
    }
}
