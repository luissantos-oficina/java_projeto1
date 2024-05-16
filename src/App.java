public class App {
    public static void main(String[] args) throws Exception {
        
        Livraria oBogalho = new Livraria();
        System.out.println(oBogalho);

        Estante oBogalhoEstante = new Estante("E1", "R/Chao");
        System.out.println(oBogalhoEstante);

        Livro oBogalhoLivro = new Livro();
        System.out.println(oBogalhoLivro);

        Leitor oBogalhoLeitor = new Leitor();
        System.out.println(oBogalhoLeitor);

    }
}
