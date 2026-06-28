package questao1;

public class PixPagamento implements PagamentoStrategy {
    private final String chavePix;

    public PixPagamento(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix realizado.");
        System.out.println("Chave Pix: " + chavePix);
        System.out.println("Valor pago: R$ " + String.format("%.2f", valor));
    }
}
