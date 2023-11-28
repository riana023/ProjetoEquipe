class Livro {
    private String titulo;
    private String categoria;
    private Autor autor;

    public Livro(String titulo, String categoria, Autor autor) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAutorNome() {
        return autor.getNome();
    }
}