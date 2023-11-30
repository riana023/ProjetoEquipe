public class Main {
    public static void main(String[] args) {
       
Biblioteca biblioteca = new Biblioteca();
Leitor leitor = new Leitor("José", biblioteca);

Autor autor1 = new Autor("Robert Kiyosaki e Sharon Lechter");
Autor autor2 = new Autor("Jane Doe");

Livro livro1 = new Livro("Pai Rico, Pai Pobre", "Finanças pessoais", autor1);
Livro livro2 = new Livro("Estruturas de Dados em Java", "Programação", autor2);

biblioteca.adicionarLivro(livro1);       
biblioteca.adicionarLivro(livro2);

List<Livro> livrosDisponiveis = biblioteca.getLivrosDisponiveis();
        if (!livrosDisponiveis.isEmpty()) {
            System.out.println("Livros disponíveis na biblioteca:");

            for (Livro livro : livrosDisponiveis) {
                System.out.println("- " + livro.getTitulo() + " (Categoria: " +
                                   livro.getCategoria() + ", Autor: " + livro.getAutorNome() + ")");
            }

            List<Livro> livrosEscolhidos = new ArrayList<>();

            if (!livrosDisponiveis.isEmpty()) {
                Livro livroEscolhido = livrosDisponiveis.get(0);
                leitor.pegarLivroEmprestado(livroEscolhido);
                livrosEscolhidos.add(livroEscolhido);
            }

            System.out.println("\nO leitor " + leitor.getNome() + " escolheu o(s) seguinte(s) livro(s):");

            for (Livro livroEscolhido : livrosEscolhidos) {
                System.out.println("- " + livroEscolhido.getTitulo() + " (Categoria: " +
                                   livroEscolhido.getCategoria() + ", Autor: " + livroEscolhido.getAutorNome() + ")");
            }
        } else {
            System.out.println("Desculpe, não há livros disponíveis no momento.");
        }
    }
}
        
    }