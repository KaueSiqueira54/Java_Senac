package arrays;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        int[] num = {9,8,7,5,2,1,10,20,3,40};
        int[] numeros = new int[10];
        int p = 1;

        //For comum

//        for(int i = 0; i < num.length; i++) {
//            System.out.println("%d".formatted(i));
//        }

        //For simplificado para exibir valores de array

        // Ordena os elementos de um array
//        Arrays.sort(num);

        // Preenche o array inteiro com o valor fixo passado
//        Arrays.fill(numeros, 10);

        // Copia um array para outro (cópia de um array para outro)
//        System.arraycopy(num, 0, numeros, 0, num.length);

        // Compara a igualdade entre dois arrays: Retorna um boolean
//        System.out.println("Arrays são iguais? %s".formatted((Arrays.equals(num, numeros) ? "Sim" : "Não")));

        //BinarySearch
//        Arrays.sort(num);
//        System.out.println("O elemento %d está no array? %s".formatted(p, (Arrays.binarySearch(num, p) > 0 ?"sim" : "não")));

//        for(int n:numeros) {
//            System.out.printf("%d - ".formatted(n));
//        }

    }
}
