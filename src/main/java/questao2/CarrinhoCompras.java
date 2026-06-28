package questao2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private final List<Item> itens;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        double total = 0.0;

        for (Item item : itens) {
            total += item.getSubtotal();
        }

        return total;
    }

    public double calculaPesoTotal() {
        double pesoTotal = 0.0;

        for (Item item : itens) {
            pesoTotal += item.getPesoTotalKg();
        }

        return pesoTotal;
    }

    public double calculaFrete(FreteStrategy freteStrategy) {
        return freteStrategy.calcular(calculaPesoTotal(), calculaTotal());
    }

    public void realizaPagamento(PagamentoStrategy pagamentoStrategy, FreteStrategy freteStrategy) {
        double totalProdutos = calculaTotal();
        double frete = calculaFrete(freteStrategy);
        double totalFinal = totalProdutos + frete;

        System.out.println("Total dos produtos: R$ " + String.format("%.2f", totalProdutos));
        System.out.println("Frete: R$ " + String.format("%.2f", frete));
        System.out.println("Total final: R$ " + String.format("%.2f", totalFinal));

        pagamentoStrategy.pagar(totalFinal);
    }

    public void exibeItens() {
        System.out.println("Itens do carrinho:");

        for (Item item : itens) {
            System.out.println("- " + item);
        }

        System.out.println("Total: R$ " + String.format("%.2f", calculaTotal()));
        System.out.println("Peso total: " + String.format("%.2f", calculaPesoTotal()) + " kg");
    }
}
