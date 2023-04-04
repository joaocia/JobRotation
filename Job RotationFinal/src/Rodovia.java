
public class Rodovia {
    public static void main(String[] args) {
        int distancia = 100; // distância entre Ribeirão Preto e Franca em km
        
        double velocidadeCarro = 110; // velocidade constante do carro em km/h
        
        double velocidadeCaminhao = 80; // velocidade constante do caminhão em km/h
        
        double tempoPedagio = 5.0 / 60; // tempo em horas que o caminhão leva para passar em cada pedágio
        
        double tempoEncontro = distancia / (velocidadeCarro + velocidadeCaminhao); // tempo em horas para os veículos se encontrarem
        
        double Carro = velocidadeCarro * (tempoEncontro - tempoPedagio / 2); // distância percorrida pelo carro até o ponto de encontro
        
        double Caminhao = distancia - Carro; // distância percorrida pelo caminhão até o ponto de encontro
        
        if (Carro < Caminhao) {
            System.out.println("O carro estará mais próximo da cidade de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão estará mais próximo da cidade de Ribeirão Preto.");
        }
    }
}

