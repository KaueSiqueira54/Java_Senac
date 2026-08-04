package arrays.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> carros = new ArrayList<>();

        //carros.trimToSize(); // Eliminar os espaços do array - 100 ex
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("HRV");
        carros.add("Fiat Uno");
        carros.add("Fiat fusion");
        //System.out.println(carros.indexOf("Polo")); // Indice de algo
        //carros.clear(); // Limpa o array

        //carros.remove("Polo"); // Remove

//        for(String s: carros) {
//            System.out.println(s);
//        }

        //Operação critica que pode retornar um erro - usar o try
        //Finally é executado independente de passar no cath ou não
        try {
            System.out.println(carros.get(0));
        } catch (IndexOutOfBoundsException error) {
            System.out.println("Valor fora do indice do array!");
        } finally {
            System.out.println("Fim do Try");
        }

        for(int i=0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
    }
}
