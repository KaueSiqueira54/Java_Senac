package matrizes;

import java.security.SecureRandom;

public class Matrizes {

    public static void main(String[] args) {

        // Matrizes - arrays dentro de arrays
        final int linhas = 3;
        final int colunas = 5;

        int numeros[][] = new int[linhas][colunas];

        int num[][] = {{1,2,3,4,5}, {10,20,30,40,50}, {5,4,3,2,1}};

         // [1, 2, 3, 4, 5] // [LINHAS [COLUNAS] ]

         // INDICE 0       INDICE 1   INDICE 2
         // [1,2,3,4,5], [1,2,3,4,5], [1,2,3,4,5]

        for(int l= 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

//        for(int l= 0; l < linhas; l++) {
//            for(int c = 0; c < colunas; c++) {
//                System.out.printf("%2d |", numeros[l][c]);
//            }
//
//            System.out.printf("%n");
//        }

        for(int[] n: num) {
            for (int v:n) {
                System.out.printf("%2d |", v);
            }
            System.out.printf("%n");
        }
    }
}
