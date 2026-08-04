package arrays.array3;

public class Principal {
    public static void main(String[] args) {

//        int[] numeros = {10,5,6,9,7,8,6,31,31,314,05,45};
//
//        PaImpar(numeros);

        int[] notas = {10,8,9,64,60,70};
        int ap, rp;
        ap=rp=0;

        conferirNotas(notas, ap, rp);

    }

    public static void conferirNotas(int[] nt, int a, int r) {
        for(int n: nt) {
            if(n >= 60) {
                a++;
            } else {
                r++;
            }
        }

        System.out.println(a);
        System.out.println(r);
    }

    public static void PaImpar(int[] num) {
        for(int n: num) {
            if(n % 2 == 0) {
                System.out.println("Par: %d".formatted(n));
            } else {
                System.out.println("Impar: %d".formatted(n));
            }
        }
    }
}
