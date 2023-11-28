public class Main {
    public static void main(String[] args) {

Autor autor1 = new Autor("Robert Kiyosaki e Sharon Lechter");
Autor autor2 = new Autor("Jane Doe");

Livro livro1 = new Livro("Pai Rico, Pai Pobre", "Finanças pessoais", autor1);
Livro livro2 = new Livro("Estruturas de Dados em Java", "Programação", autor2);
biblioteca.adicionarLivro(livro1);       
biblioteca.adicionarLivro(livro2);
        
    }