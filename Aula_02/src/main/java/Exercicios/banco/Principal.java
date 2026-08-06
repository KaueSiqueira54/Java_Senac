package Exercicios.banco;

import java.util.Scanner;

import static Exercicios.banco.Conta.*;

public class Principal {
    public static void main(String[] args) {
        inicioPrograma();
    }

    public static void inicioPrograma() {
        Scanner leitura = new Scanner(System.in);
        int opcao;

        System.out.println("Seja bem vindo!");

        while (true) {
            System.out.println("""
                    ------------------
                    1 - Criar conta
                    2 - Listar conta
                    3 - Excluir conta
                    4 - Acessar conta
                    5 - Encerrar sistema
                    -------------------
                    """);

            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    criarConta();
                    break;
                case 2:
                    listarContas();
                    break;
                case 3:
                    if(contas.isEmpty()) {
                        System.out.println("Não há contas criadas para excluir.");
                        break;
                    } else {
                        excluirConta();
                        break;
                    }
                case 4:
                    if(contas.isEmpty()) {
                        System.out.println("Não há contas criadas para listar/acessar.");
                        break;
                    } else {
                        acessarConta();
                        break;
                    }
            }

            if(opcao == 5) {
                System.out.println("Obrigado por usar os sistema!");
                break;
            }
        }
    }
}
