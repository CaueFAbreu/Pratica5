package questao4;

import java.util.ArrayList;
import java.util.List;

public class Acao {
    private final String codigo;
    private double preco;
    private final List<Investidor> investidores;

    public Acao(String codigo, double precoInicial) {
        this.codigo = codigo;
        this.preco = precoInicial;
        this.investidores = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionarInvestidor(Investidor investidor) {
        if (!investidores.contains(investidor)) {
            investidores.add(investidor);
        }
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    public void alterarPreco(double novoPreco) {
        System.out.println("\nPreço da ação " + codigo + " alterado de R$ "
                + String.format("%.2f", preco) + " para R$ " + String.format("%.2f", novoPreco));

        this.preco = novoPreco;
        notificarInvestidores();
    }

    private void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(this);
        }
    }
}
