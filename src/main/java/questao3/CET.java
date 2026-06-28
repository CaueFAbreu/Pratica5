package questao3;

import java.util.ArrayList;
import java.util.List;

public class CET {
    private final List<ObservadorTempo> observadores;
    private double temperatura;
    private double umidadeRelativaAr;
    private double velocidadeRajadaVento;

    public CET() {
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(ObservadorTempo observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorTempo observador) {
        observadores.remove(observador);
    }

    public void coletarDados(double temperatura, double umidadeRelativaAr, double velocidadeRajadaVento) {
        this.temperatura = temperatura;
        this.umidadeRelativaAr = umidadeRelativaAr;
        this.velocidadeRajadaVento = velocidadeRajadaVento;

        System.out.println("\nCET coletou novos dados:");
        System.out.println("Temperatura: " + temperatura + " °C");
        System.out.println("Umidade relativa do ar: " + umidadeRelativaAr + "%");
        System.out.println("Rajada de vento: " + velocidadeRajadaVento + " km/h");

        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorTempo observador : observadores) {
            observador.atualizar(temperatura, umidadeRelativaAr, velocidadeRajadaVento);
        }
    }
}
