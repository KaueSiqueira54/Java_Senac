package metodos;

public class Metodos {

    public static void main(String[] args) {

        System.out.println(Somar(10.50,50.2,30.5)); // Double
        System.out.println(Somar(1,50,9,8)); // int

    }

    //Sobrecarga de métodos = Métodos de mesmo nome, porém com parâmetros diferentes
    public static int Somar(int... numeros) {
        int res=0;
        for(int n: numeros) {
            res+=n;
        }
        return res;
    }

    public static Double Somar(Double... numeros) {
        double res = 0;
        for (Double n:numeros) {
            res+=n;
        }
        return res;
    }

    //Tenho acesso fora da classe
    public static void Mensagem(String mensagem, int l) {
        for(int i=0; i < l; i++) {
            System.out.println(mensagem);
        }
    }

}
