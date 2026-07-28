package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        //Java por padrão inicializa com zero (0) os valores das posições de um array de inteiros

        final int tamanho = 5;

        int[] numeros = new int[5];

        //adicionando elementos no array;

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

//        for(int i=0; i < numeros.length; i++) {
//            System.out.printf("%d \n", numeros[i]);
//        }

        //Outro exemplo

        int[] numeros2 = {10,20,30,40,50};

//        Arrays.stream(numeros2).forEach(System.out::println);

        char[] gabarito={'a', 'b', 'c', 'd', 'e'};
        char[] respostas= new char[5];
        int nota = 0;

        Scanner leitura = new Scanner(System.in);

        for(int i = 0; i < respostas.length; i++) {
            System.out.println("Digite a resposta %d".formatted(i));
            respostas[i] = leitura.nextLine().charAt(0);
        }

        for(int i = 0; i < respostas.length; i++) {
            if(gabarito[i] == respostas[i]) {
                nota++;
            }
        }

        System.out.println("Nota do aluno: %d".formatted(nota));

    }


}
