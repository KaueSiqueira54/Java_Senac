package arrays.arrays2;

public class Arrays {
    public static void main(String[] args) {

//        int tamanho = 5;
//        int[] num = {52,100,245,3456,654};

        //        int[] numeros = new int[tamanho];
//
//        numeros[0] = 10;
//        numeros[1] = 12;
//        numeros[2] = 14;
//        numeros[3] = 156;
//        numeros[4] = 167;

//        for(int i = numeros.length - 1; i >= 0; i--) {
//            System.out.println(numeros[i]);
//        }

//        for(int n: num) {
//            System.out.println(n);
//        }

        //Coleção de Carros

        final int numCarros = 5;
        Carro[] carros = new Carro[numCarros];
        String[] modelosCarros = {"HRV", "GOL", "Camaro", "Toro", "Ferrari"};

        //Inicializar o array carros
        for(int i=0; i < carros.length; i++) {
            carros[i] = new Carro(modelosCarros[i]);
        }

        //Imprimir os carros
        for(Carro c: carros) {
            c.Info();
        }
    }
}
