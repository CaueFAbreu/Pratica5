package questao2;

public class PixPagamento implements PagamentoStrategy {
    private final String chavePix;

    public PixPagamento(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via Pix realizado no valor de R$ " + String.format("%.2f", valor));
        System.out.println("Chave Pix usada: " + chavePix);
    }
}
