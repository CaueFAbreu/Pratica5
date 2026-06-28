package questao1;

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

    public void realizaPagamento(PagamentoStrategy pagamentoStrategy) {
        double total = calculaTotal();
        pagamentoStrategy.pagar(total);
    }

    public void exibeItens() {
        System.out.println("Itens do carrinho:");

        for (Item item : itens) {
            System.out.println("- " + item);
        }

        System.out.println("Total: R$ " + String.format("%.2f", calculaTotal()));
    }
}
