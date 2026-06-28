package questao2;

public class NormalFrete implements FreteStrategy {
    @Override
    public double calcular(double pesoTotalKg, double valorCompra) {
        if (valorCompra >= 500.00) {
            return 0.00;
        }

        double taxaBase = 10.00;
        double valorPorKg = 4.00;
        return taxaBase + pesoTotalKg * valorPorKg;
    }
}
