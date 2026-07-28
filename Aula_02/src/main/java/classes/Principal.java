package classes;

public class Principal {

    public static void main(String[] args) {

        int num = 0;
        Jogador.Pontos();
        Jogador.Pontos();
        Jogador.Pontos();

        System.out.printf("%nAlerta: %s%n", Jogador.alerta ? "Sim" : "Não");

        //Pré incremento - primeiro soma e depois executa ++num
        //Pós incremento - executa primeiro e depois soma
        Jogador jogador = new Jogador(++num);
        Jogador jogador2 = new Jogador(++num);
        Jogador jogador3 = new Jogador(++num);

        Jogador.alerta = true;

        jogador.info();
        jogador2.info();
        jogador3.info();
    }

}
