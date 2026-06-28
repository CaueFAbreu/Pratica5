package questao1;

public class CartaoPagamento implements PagamentoStrategy {
    private final String nomeTitular;
    private final String numeroCartao;

    public CartaoPagamento(String nomeTitular, String numeroCartao) {
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(double valor) {
        String finalCartao = numeroCartao.substring(numeroCartao.length() - 4);

        System.out.println("Pagamento via cartão de crédito realizado.");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Cartão final: " + finalCartao);
        System.out.println("Valor pago: R$ " + String.format("%.2f", valor));
    }
}
