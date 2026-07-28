package Super.veiculos;

public class Veiculo {
    protected String nome;
    protected int tipo;

    //protected permite o acesso a classes do mesmo pacote/extends

    public Veiculo(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void Info() {
        System.out.printf("Nome: %s%n", this.nome);
        System.out.printf("Tipo: %d%n", this.tipo);
    }

    public String getNome() {
        return this.nome;
    }

}
