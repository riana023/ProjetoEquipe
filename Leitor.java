class Leitor {
    private String nome;
    private Biblioteca biblioteca;

    public Leitor(String nome, Biblioteca biblioteca) {
        this.nome = nome;
        this.biblioteca = biblioteca;
    }

    public void pegarLivroEmprestado(Livro livro) {
        biblioteca.adicionarLivro(livro);
    }

    public List<Livro> listarLivrosDisponiveis() {
        return biblioteca.getLivrosDisponiveis();
    }

    public String getNome() {
        return nome;
    }
}