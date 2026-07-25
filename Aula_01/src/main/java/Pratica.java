import java.util.Scanner;

public class Pratica {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 11;
        numeros[2] = 12;
        numeros[3] = 13;
        numeros[4] = 14;

        for(int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] nomes = {"Kaue", "Cesar", "Gustavo"};

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


    }

}
