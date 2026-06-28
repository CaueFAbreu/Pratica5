package questao4;

public class AcaoBroker {
    private final String nome;

    public AcaoBroker(String nome) {
        this.nome = nome;
    }

    public void comprar(Investidor investidor, Acao acao) {
        System.out.println("Corretor " + nome + " recebeu comando de COMPRA.");
        System.out.println("Investidor: " + investidor.getNome());
        System.out.println("Ação: " + acao.getCodigo() + " | Preço atual: R$ " + String.format("%.2f", acao.getPreco()));
    }

    public void vender(Investidor investidor, Acao acao) {
        System.out.println("Corretor " + nome + " recebeu comando de VENDA.");
        System.out.println("Investidor: " + investidor.getNome());
        System.out.println("Ação: " + acao.getCodigo() + " | Preço atual: R$ " + String.format("%.2f", acao.getPreco()));
    }
}
