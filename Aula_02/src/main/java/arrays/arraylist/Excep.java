package arrays.arraylist;

import java.util.ArrayList;

public class Excep {
        public static void main(String[] args) {

            int nota1, nota2, res;

            nota1=10;
            nota2=80;

            if(nota1 > 50) {
                throw new IllegalArgumentException("Valor de nota inválido!");
            }
            if(nota2 > 50) {
                throw new IllegalArgumentException("Valor de nota inválido!");
            }

            res= nota1 + nota2;
            System.out.println(res);

            //Operação critica que pode retornar um erro - usar o try
            //Finally é executado independente de passar no cath ou não
//            try {
//                System.out.println(carros.get(0));
//            } catch (IndexOutOfBoundsException error) {
//                System.out.println("Valor fora do indice do array!");
//            } finally {
//                System.out.println("Fim do Try");
//            }

//            for(int i=0; i < carros.size(); i++) {
//                System.out.println(carros.get(i));
//            }
        }
    }
