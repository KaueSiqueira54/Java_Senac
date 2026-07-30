package switchs;

public class Switch {

    public static void main(String[] args) {
//        int posicao = 1;
//
//        switch(posicao) {
//            case 1:
//                System.out.println("O número é um");
//                break;
//            case 2:
//                System.out.println("O número é dois");
//                break;
//        }

        //do while, while, for, switch -break e continue
        //Continue - Pula a iteração para o próximo comando

        int cont = 100;

        for(int i=0; i <= cont; i++) {
            if(i >= 10 && i <= 60) {
               continue;
               //Para a iteração e pula para a próxima
            }
            System.out.println(i);

        }


    }

}
