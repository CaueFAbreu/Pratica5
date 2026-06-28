package questao3;

public class AeroportoUberlandia implements ObservadorTempo {
    private static final double LIMITE_RAJADA_FORTE = 50.0;

    @Override
    public void atualizar(double temperatura, double umidadeRelativaAr, double velocidadeRajadaVento) {
        System.out.println("Aeroporto de Uberlândia recebeu os dados de rajada de vento.");

        if (velocidadeRajadaVento >= LIMITE_RAJADA_FORTE) {
            System.out.println("ALERTA AEROPORTO: rajada forte de vento: " + velocidadeRajadaVento + " km/h");
        } else {
            System.out.println("Rajada de vento sem alerta operacional: " + velocidadeRajadaVento + " km/h");
        }
    }
}
