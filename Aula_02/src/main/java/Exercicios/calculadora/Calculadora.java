package Exercicios.calculadora;
import java.util.Scanner;

public class Calculadora {

    static public void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero res = new Numero();

        int opc = 1;

        while(opc == 1) {
            System.out.println("Digite o valor 1: ".formatted(n1));
            n1.setValor(leitura.nextInt());

            System.out.println("Digite o valor 2: ".formatted(n1));
            n2.setValor(leitura.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            System.out.println("A soma de %d + %d = %d: ".formatted(n1.getValor(), n2.getValor(), res.getValor()));

            System.out.println("""
                    Deseja continuar?
                    1 - Sim
                    2- Não
                    """);
            opc = leitura.nextInt();
            leitura.nextLine();
        }
        System.out.println("Obrigado por usar o sistema!");
    }
}
