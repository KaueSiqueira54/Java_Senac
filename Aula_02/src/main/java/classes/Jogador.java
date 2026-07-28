package classes;

public class Jogador {

    private int num;
    private int vidas;
    static boolean alerta = false;
    static int qtdJodadores = 0;
    static int pontosJogadores=0;


    //Método construtor
     public Jogador(int num) {
         this.num = num;
         this.vidas = 1;
         qtdJodadores++;
         System.out.println("O método foi chamado e o Jogador número %d foi criado".formatted(num));
     }

     //get - obter valores de vaiáveis de uma classe

    public int getVidas() {
         return this.vidas;
    }

    public void setVidas(int vidas) {
         if(vidas > 3) {
             this.vidas = 3;
         } else if(vidas < 0) {
             this.vidas = 0;
         } else {
             this.vidas = vidas;
         }
    }

    public void info() {
        System.out.println("Jogador: %d".formatted(num));
        System.out.println("Vidas: %d".formatted(this.vidas));
        System.out.println("Alerta: %s".formatted(alerta ? "Sim" : "Não"));
        System.out.println("Jogadores: %d".formatted(qtdJodadores));
        System.out.println("Pontos Jogadores: %d".formatted(pontosJogadores));
        System.out.println("-------------------------");
    }

    static void Pontos() {
         pontosJogadores+=10;
    }

}
