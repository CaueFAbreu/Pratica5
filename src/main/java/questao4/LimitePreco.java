package questao4;

public class LimitePreco {
    private final double minimo;
    private final double maximo;

    public LimitePreco(double minimo, double maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public double getMaximo() {
        return maximo;
    }
}
