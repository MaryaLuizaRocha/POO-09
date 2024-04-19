package Pacotes;

public class PacoteSimples extends Pacote {
    @Override
    public double calcularCustoEnvio(double peso) {
        return peso * 0.5; // Custo de envio padrão para pacotes simples
    }
}
