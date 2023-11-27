import java.util.ArrayList;
import java.util.List;

class Biblioteca {

    private List<Livro> livros;
    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<Livro> getLivrosDisponiveis() {
        List<Livro> livrosDisponiveis = new ArrayList<>();
        
        for (Livro livro : livros) {
            
            livrosDisponiveis.add(livro);
        }
        
        return livrosDisponiveis;
    }
}