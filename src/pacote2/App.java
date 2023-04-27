package pacote2;

import pacote3.Carro;
import pacote3.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */
       
        Motorista mot = new Motorista("Thomas",123456);  
        Carro carro = new Carro("ABC1234", 123456789, mot);

        System.out.println("PASSAGEIRO: Motorista, acelera o carro até 100Km/h!");
        System.out.println("MOTORISTA: Ok! Vamos lá!");
        carro.getMotorista().acelerar(100);

        System.out.printf("Velocidade do carro: %s km/h", carro.getVelocidadeAtual());
    }

}
