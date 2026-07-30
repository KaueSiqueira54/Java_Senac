package Exercicios.prova;

import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome;
        String resposta;
        int nota = 0;

        String[] perguntas = {
                """
                1) Quanto é 10 X 5?
                
                a) 50
                b) 30
                c) 40
                """,
                """
                2) Quanto é 255 X 10?
                
                a) 5021
                b) 2550
                c) 2555
                """,
                """
                3) Quanto é 8 X 8?
                
                a) 54
                b) 72
                c) 64
                """,
                """
                4) Quanto é 9 X 9?
                
                a) 200
                b) 81
                c) 78
                """,
                """
                5) Quanto é 6 X 6?
                
                a) 36
                b) 72
                c) 64
                """
        };

        String[] gabarito = {"a", "b", "c", "b", "a"};

        String[] respostas = new String[5];

        System.out.println("Digite seu nome: \n");
        nome = leitura.nextLine();

        for(int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Sua resposta: ");
            resposta = leitura.nextLine();

            if(resposta.toLowerCase().equals(gabarito[i])) {
                nota+=1;
            }
        }

        System.out.println("""
                Aluno: %s
                Nota: %d
                """.formatted(nome, nota));
    }
}
