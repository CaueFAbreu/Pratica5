package questao3;

public class PrefeituraUberlandia implements ObservadorTempo {
    private static final double LIMITE_ATENCAO_UMIDADE = 30.0;
    private static final double LIMITE_ALERTA_UMIDADE = 20.0;

    @Override
    public void atualizar(double temperatura, double umidadeRelativaAr, double velocidadeRajadaVento) {
        System.out.println("Prefeitura de Uberlândia recebeu os dados de umidade.");

        if (umidadeRelativaAr <= LIMITE_ALERTA_UMIDADE) {
            System.out.println("ALERTA DA DEFESA CIVIL: umidade muito baixa: " + umidadeRelativaAr + "%");
        } else if (umidadeRelativaAr <= LIMITE_ATENCAO_UMIDADE) {
            System.out.println("ATENÇÃO: umidade baixa: " + umidadeRelativaAr + "%");
        } else {
            System.out.println("Umidade dentro de condição aceitável: " + umidadeRelativaAr + "%");
        }
    }
}
