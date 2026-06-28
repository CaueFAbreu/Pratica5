package questao2;

public class SedexFrete implements FreteStrategy {
    @Override
    public double calcular(double pesoTotalKg, double valorCompra) {
        double taxaBase = 20.00;
        double valorPorKg = 8.00;
        return taxaBase + pesoTotalKg * valorPorKg;
    }
}
