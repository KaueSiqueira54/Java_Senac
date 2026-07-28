package Super;

import Super.veiculos.Veiculo;

public class Aviao extends Veiculo {
    private int categoria;


    public Aviao(String nome, int categoria) {
        super(nome, 10);
    }

    public void Info() {
        super.Info();
        System.out.printf("Categoria: %d%n", this.categoria);
    }
}
