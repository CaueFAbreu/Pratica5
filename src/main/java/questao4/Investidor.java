package questao4;

import java.util.HashMap;
import java.util.Map;

public class Investidor implements AcaoObserver {
    private final String nome;
    private final AcaoBroker broker;
    private final Map<String, LimitePreco> limitesPorAcao;

    public Investidor(String nome, AcaoBroker broker) {
        this.nome = nome;
        this.broker = broker;
        this.limitesPorAcao = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void definirLimites(Acao acao, double minimo, double maximo) {
        limitesPorAcao.put(acao.getCodigo(), new LimitePreco(minimo, maximo));
        acao.adicionarInvestidor(this);
    }

    @Override
    public void atualizar(Acao acao) {
        LimitePreco limitePreco = limitesPorAcao.get(acao.getCodigo());

        if (limitePreco == null) {
            return;
        }

        System.out.println("Investidor " + nome + " foi notificado sobre " + acao.getCodigo()
                + ": R$ " + String.format("%.2f", acao.getPreco()));

        if (acao.getPreco() >= limitePreco.getMaximo()) {
            System.out.println("Preço máximo atingido para " + nome + ".");
            broker.vender(this, acao);
        } else if (acao.getPreco() <= limitePreco.getMinimo()) {
            System.out.println("Preço mínimo atingido para " + nome + ".");
            broker.comprar(this, acao);
        } else {
            System.out.println("Preço dentro dos limites definidos por " + nome + ". Nenhuma operação executada.");
        }
    }
}
