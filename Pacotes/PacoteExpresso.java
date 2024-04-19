package Pacotes;

public class PacoteExpresso extends Pacote {
    @Override
    public double calcularCustoEnvio(double peso) {
        return peso * 1.5; // Custo de envio expresso é 3 vezes o custo padrão
    }
}
