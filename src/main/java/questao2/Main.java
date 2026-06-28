package questao2;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionaItem(new Item("Monitor", 800.00, 1, 3.50));
        carrinho.adicionaItem(new Item("Mouse", 100.00, 1, 0.20));
        carrinho.adicionaItem(new Item("Livro", 80.00, 2, 0.60));

        carrinho.exibeItens();

        System.out.println("\n--- Compra com frete Sedex e pagamento Pix ---");
        carrinho.realizaPagamento(new PixPagamento("cliente@email.com"), new SedexFrete());

        System.out.println("\n--- Compra com frete Normal e pagamento Boleto ---");
        carrinho.realizaPagamento(new BoletoPagamento("123.456.789-00"), new NormalFrete());
    }
}
