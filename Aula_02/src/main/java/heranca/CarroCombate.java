package heranca;

public class CarroCombate extends Carro{

    private final int MAX_ARMAMENTO=100;
    private final int MIN_ARMAMENTO=0;
    private int qtdeArmamento;

    public CarroCombate(String nome, int blindagem) {
        super(nome); // Chama o construtor da classe pai (
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdeArmamento = 100;
    }

    public void setQtdeArmamento(int qtdeArmamento) {
        this.qtdeArmamento += qtdeArmamento;
        if(qtdeArmamento > MAX_ARMAMENTO) {
            this.qtdeArmamento = MAX_ARMAMENTO;
        }
        if(qtdeArmamento < MIN_ARMAMENTO) {
            this.qtdeArmamento = MIN_ARMAMENTO;
        }
    }

    public int getQtdeArmamento() {
        return this.qtdeArmamento;
    }

    public void Atirar() {
        if(this.qtdeArmamento > MIN_ARMAMENTO) {
            setQtdeArmamento(-1);
        }else {
            System.out.println("Sem armamento");
        }
    }

    public void Info() {
        super.Info();
        System.out.println("Qtde de armamento: %d".formatted(this.qtdeArmamento));
    }

}
