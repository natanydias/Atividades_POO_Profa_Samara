public class Biblioteca {
    private Livro[] livros;
    private int contador;

    // Construtor
    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado à biblioteca.");
        } else {
            System.out.println("Biblioteca cheia! Não é possível adicionar mais livros.");
        }
    }

    public void emprestarLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].emprestar();
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado.");
    }

    public void mostrarLivros() {
        System.out.println("\n📚 Livros na Biblioteca:");
        for (int i = 0; i < contador; i++) {
            Livro livro = livros[i];
            String status = livro.isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println("- \"" + livro.getTitulo() + "\" | Status: " + status);
        }
    }
}
