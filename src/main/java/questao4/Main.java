package questao4;

public class Main {
    public static void main(String[] args) {
        AcaoBroker brokerXP = new AcaoBroker("XP Investimentos");
        AcaoBroker brokerInter = new AcaoBroker("Banco Inter");

        Acao petr4 = new Acao("PETR4", 32.00);
        Acao vale3 = new Acao("VALE3", 65.00);

        Investidor ana = new Investidor("Ana", brokerXP);
        Investidor bruno = new Investidor("Bruno", brokerInter);
        Investidor carla = new Investidor("Carla", brokerXP);

        ana.definirLimites(petr4, 28.00, 36.00);
        bruno.definirLimites(vale3, 60.00, 70.00);
        carla.definirLimites(petr4, 30.00, 34.00);
        carla.definirLimites(vale3, 62.00, 68.00);

        petr4.alterarPreco(33.00);
        petr4.alterarPreco(36.50);
        petr4.alterarPreco(27.50);

        vale3.alterarPreco(67.00);
        vale3.alterarPreco(71.00);
        vale3.alterarPreco(59.50);
    }
}
