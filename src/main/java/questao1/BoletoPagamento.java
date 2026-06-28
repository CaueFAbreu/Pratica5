package questao1;

public class BoletoPagamento implements PagamentoStrategy {
    private final String cpfCliente;

    public BoletoPagamento(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Boleto bancário gerado.");
        System.out.println("CPF do cliente: " + cpfCliente);
        System.out.println("Valor do boleto: R$ " + String.format("%.2f", valor));
    }
}
