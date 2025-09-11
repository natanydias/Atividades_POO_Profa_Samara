public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; // inicia como disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" já está disponível.");
        }
    }
}