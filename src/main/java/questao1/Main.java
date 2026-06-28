package questao1;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionaItem(new Item("Mouse gamer", 120.00, 1));
        carrinho.adicionaItem(new Item("Teclado mecânico", 250.00, 1));
        carrinho.adicionaItem(new Item("Cabo USB-C", 35.00, 2));

        carrinho.exibeItens();

        System.out.println("\n--- Pagamento com Pix ---");
        carrinho.realizaPagamento(new PixPagamento("cliente@email.com"));

        System.out.println("\n--- Pagamento com cartão ---");
        carrinho.realizaPagamento(new CartaoPagamento("Caue Abreu", "1234567812345678"));

        System.out.println("\n--- Pagamento com boleto ---");
        carrinho.realizaPagamento(new BoletoPagamento("123.456.789-00"));
    }
}
