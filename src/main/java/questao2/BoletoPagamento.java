package questao2;

public class BoletoPagamento implements PagamentoStrategy {
    private final String cpfCliente;

    public BoletoPagamento(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Boleto bancário gerado no valor de R$ " + String.format("%.2f", valor));
        System.out.println("CPF do cliente: " + cpfCliente);
    }
}
