package questao2;

public class Item {
    private final String nome;
    private final double preco;
    private final int quantidade;
    private final double pesoKg;

    public Item(String nome, double preco, int quantidade, double pesoKg) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.pesoKg = pesoKg;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getSubtotal() {
        return preco * quantidade;
    }

    public double getPesoTotalKg() {
        return pesoKg * quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + nome + " - R$ " + String.format("%.2f", getSubtotal())
                + " - Peso: " + String.format("%.2f", getPesoTotalKg()) + " kg";
    }
}
