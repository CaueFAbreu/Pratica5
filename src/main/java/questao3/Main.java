package questao3;

public class Main {
    public static void main(String[] args) {
        CET cet = new CET();

        PrefeituraUberlandia prefeitura = new PrefeituraUberlandia();
        AeroportoUberlandia aeroporto = new AeroportoUberlandia();

        cet.adicionarObservador(prefeitura);
        cet.adicionarObservador(aeroporto);

        cet.coletarDados(31.5, 35.0, 25.0);
        cet.coletarDados(34.0, 22.0, 40.0);
        cet.coletarDados(37.0, 18.0, 60.0);
    }
}
