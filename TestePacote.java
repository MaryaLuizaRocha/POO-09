package Pacotes;

public class TestePacote {
   
    public static void main(String[] args) {
        Pacote pacote1 = new Pacote();
        Pacote pacote2 = new PacoteSimples();
        Pacote pacote3 = new PacoteExpresso();

        double pesoPacote1 = 10.0;
        double pesoPacote2 = 5.0;
        double pesoPacote3 = 3.0;

        System.out.println("Custo de envio do pacote 1: " + pacote1.calcularCustoEnvio(pesoPacote1));
        System.out.println("Custo de envio do pacote 2: " + pacote2.calcularCustoEnvio(pesoPacote2));
        System.out.println("Custo de envio do pacote 3: " + pacote3.calcularCustoEnvio(pesoPacote3));
    }
}